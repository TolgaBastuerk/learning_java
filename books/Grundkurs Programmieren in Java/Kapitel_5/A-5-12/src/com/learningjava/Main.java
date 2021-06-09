package com.learningjava;
import java.util.Scanner;

public class Main {
    /*
    Aufgabe 5.12 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */
    public static double g = 9.81;

    public static double f(double x) {
        return x*x - g*(x - 1 + Math.exp(-x));
    }

    public static double dfdx(double x) {
        return 2*x - g*(1 - Math.exp(-x));
    }

    public static double newton(double x0, double eps) {
        double xAlt = 0;
        double xNeu = x0;
        int kmax = 50;
        int k = 0;
        do {
            xAlt = xNeu;
            xNeu = xAlt - f(xAlt) / dfdx(xAlt);
            k++;
            if(k == kmax) {
                return -1;
            }
        } while(Math.abs(xNeu - xAlt) <= eps*Math.abs(xNeu));
        return xNeu;
    }

    public static double tiefe(double t, double xs) {
        return (g*(xs*t + Math.exp(-xs*t) - 1))/(xs*xs);
    }

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("x0 : ");
        double x0 = scanner.nextDouble();
        System.out.print("eps : ");
        double eps = scanner.nextDouble();
        double xs = newton(x0, eps);
        if(xs > 0)
            System.out.println("Berechnete Tiefe: " + tiefe(10,xs));
        else
            System.out.println("Newton-Iteration ist fehlgeschlagen.");

    }
}
