package com.learningjava;

    /**
        Aufgabe 10.5 aus [1]

        Quelle:
        [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
    */

public class Tierleben {

    public static <T> void gibAus(T tier) {
        System.out.println("Unbekannt: " + tier);
    }
    public static <T extends Tier> void gibAus(T tier) {
        System.out.println("Tier: " + tier);
    }
    public static <T extends Haustier> void gibAus(T tier) {
        System.out.println("Haustier: " + tier);
    }

    public static void main(String[] args) {
	// write your code here
        gibAus("Amoebe");
        gibAus(new Katze());
        gibAus(new Hauskatze());
        gibAus(new Wildkatze());
    }
}
