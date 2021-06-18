package com.learningjava;
import java.util.Scanner;

public class Main {
    /*
    Aufgabe 8.3:
    "Überschreiben Sie die toString-Methode der Klasse Euro. Anstelle von Dollar
    soll für diese Objekte der Wert in der europäischen Währung ausgegeben werden.
    Wie sieht nun die Stringausgabe für ein Objekt der Klasse Lire aus?"

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	    var scanner = new Scanner(System.in);
        var dm = new DM(1000);
        var lire = new Lire(1000);
        var franc = new Franc(1000);
        System.out.println(dm.waehrungsBetrag() + " DM entsprechen " + dm);
        System.out.println(lire.waehrungsBetrag() + " Lire entsprechen " + lire);
        System.out.println(franc.waehrungsBetrag() + " Franc entsprechen " + franc);


    }
}
