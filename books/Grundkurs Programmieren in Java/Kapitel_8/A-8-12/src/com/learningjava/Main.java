package com.learningjava;

    /*
    Aufgabe 8.12 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Sandwich();

        /*
        Lösung:

        Erst werden die Konstruktoren der Superklassen ausgeführt:
        "Mahlzeit()"
        "Mittagessen()"
        "Vesper()"

        Im Anschluss die Klassenvariablen in der Subklasse:
        "Brot()"
        "Wurst()"
        "Salat()"

        Und zu Letzt der Konstruktor der Subklasse:
        "Sandwich()"
         */
    }
}
