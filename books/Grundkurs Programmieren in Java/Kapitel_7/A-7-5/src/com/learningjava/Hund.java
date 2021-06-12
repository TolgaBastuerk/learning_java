package com.learningjava;
    /*
    Aufgabe 7.5:
    "Geben Sie an, was beim Start der Klasse Hund ausgegeben wird." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Hund extends Fuchs {
    Maus m = new Maus();
    Ratte r = new Ratte();
    Hund() {
        System.out.println("Hund");
    }

    public static void main(String[] args) {
	// write your code here
        new Hund();
    }
}
