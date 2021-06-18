package com.learningjava;
    /*
    Aufgabe 8.4:
    "Welche Ausgabe liefert das folgende Codestück?" [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vater vaeterchen = new Vater();
        Sohn soehnchen = new Sohn();
        System.out.println(vaeterchen instanceof Sohn);     // false
        System.out.println(vaeterchen instanceof Vater);    // true
        System.out.println(vaeterchen instanceof Object);   // true
        System.out.println(soehnchen instanceof Sohn);      // true
        System.out.println(soehnchen instanceof Vater);     // true
        System.out.println(soehnchen instanceof Object);    // true
    }
}
