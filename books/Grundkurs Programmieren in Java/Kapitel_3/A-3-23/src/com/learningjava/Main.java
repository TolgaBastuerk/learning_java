package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.23:
    "Welcher Wert e wird von diesem Programm berechnet und ausgegeben?
    Überlegen Sie sich ein deutlich kürzeres Programmstück, das mit nur drei if-
    Anweisungen auskommt, aber das Gleiche leistet." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, e;
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();
        System.out.print("d = ");
        d = scanner.nextDouble();

        taskBeforeOptimization(a, b, c, d);
        taskAfterOptimization(a, b, c, d);
    }

    public static void taskBeforeOptimization(
            double a,
            double b,
            double c,
            double d) {
        double e;
        if(b > a )
            if(c > b)
                if(d > c)
                    e = d;
                else
                    e = c;
            else
            if(d > b)
                e = d;
            else
                e = b;
        else
        if(c > a)
            if(d > c)
                e = d;
            else
                e = c;
        else
        if(d > a)
            e = d;
        else
            e = a;
        System.out.println();
        System.out.println("unoptimized: e = " + e);
    }

    public static void taskAfterOptimization(
            double a,
            double b,
            double c,
            double d) {
        double e = a;
        if( b > e)
            e = b;
        if( c > e)
            e = c;
        if( d > e )
            e = d;
        System.out.println();
        System.out.println("optimized: e = " + e);

    }


}
