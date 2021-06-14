package com.learningjava;
    /*
    Aufgabe 7.10

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class TestStrecke {

    public static void main(String[] args) {
	// write your code here
        Punkt ursprung = new Punkt(0.0,0.0);
        Punkt endpunkt = new Punkt(4.0, 3.0);
        Strecke s = new Strecke(ursprung, endpunkt);
        System.out.println("Die Laenge der Strecke " + s +
                " betraegt " + s.getLaenge() + ".");
        System.out.println();
        System.out.println("Strecke s eingeben:");
        s.read();
        System.out.println();
        System.out.println("Die Laenge der Strecke " + s +
                " betraegt " + s.getLaenge() + ".");
    }
}
