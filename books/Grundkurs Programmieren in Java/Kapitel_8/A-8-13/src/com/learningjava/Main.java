package com.learningjava;
    /*
    Aufgabe 8.13 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Aufgabenteil a)");

        Fahrzeug fahrzeug;
        Auto auto = new Auto();
        fahrzeug = auto;
        fahrzeug.fahre();

        System.out.println("Aufgabenteil b)");

        AKlasse a = new AKlasse();
        System.out.println("Wert von a ist: " + a.wert);
        System.out.println("Wert von a ist: " + a.wert());
        CKlasse b = new CKlasse();
        System.out.println("Wert von b ist: " + b.wert);
        System.out.println("Wert von b ist: " + b.wert());
        AKlasse c = b;
        System.out.println("Wert von c ist: " + c.wert);
        System.out.println("Wert von c ist: " + c.wert());

    }
}
