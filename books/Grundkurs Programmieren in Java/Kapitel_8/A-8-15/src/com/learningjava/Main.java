package com.learningjava;
import java.util.Scanner;

    /*
    Aufgabe 8.15 und 8.16 aus [1]
    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */


public class Main {

    public static void main(String[] args) {
	// write your code here
        Point a = new Point(1,1);
        Point b = new Point(3,3);
        Strecke s = new Strecke(a,b);
        System.out.println("Die Strecke: " + s);
        System.out.println("Die Laenge der Strecke betraegt " + s.getLaenge() + ".");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Winkel phi eingeben: ");
        double phi = scanner.nextDouble();

        s.turn(phi);
        System.out.println("Die Laenge betraegt nach der Drehung um " + phi + " Grad " + s.getLaenge() + ".");
    }
}
