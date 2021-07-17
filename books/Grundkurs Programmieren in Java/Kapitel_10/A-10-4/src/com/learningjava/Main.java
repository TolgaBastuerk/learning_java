package com.learningjava;

    /**
    Aufgabe 10.4 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tierkaefig kaefig = new Tierkaefig();
        kaefig.setInsasse(new Katze());
    }
}
