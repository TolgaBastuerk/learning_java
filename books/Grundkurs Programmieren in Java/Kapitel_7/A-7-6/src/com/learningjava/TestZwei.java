package com.learningjava;
    /*
    Aufgabe 7.6:
    "Geben Sie an, was beim Aufruf der Klasse TestZwei ausgegeben wird." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class TestZwei {

    public static void main(String[] args) {
	// write your code here
        Eins e1 = new Eins(1), e2;
        Zwei z1 = new Zwei(e1), z2;
        System.out.print(Eins.g + "-");     // 2
        System.out.println(z1.h.f);         // 1

        e2 = (Eins) e1.clone();             // f = 3
        z2 = (Zwei) z1.clone();             // f = 1

        e1.f = 4;
        Eins.g = 5;

        System.out.print(e2.f + "-");       // 3
        System.out.print(e2.g + "-");       // 5
        System.out.print(z1.h.f + "-");     // 4
        System.out.print(z2.h.f + "-");     // 4
        System.out.println(z2.h.g);         // 5
    }
    // erwartete Ausgabe:
    // 2-1
    // 3-5-4-4-5
}
