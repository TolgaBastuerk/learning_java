package com.learningjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.31:
    "Schreiben Sie ein Java-Programm, das eine einzulesende ganze Dezimalzahl d in
    eine Binärzahl b umrechnet und ausgibt. Dabei soll d mit Hilfe des Datentyps
    short und b mit Hilfe des Datentyps long dargestellt werden, wobei b nur die
    Ziffern 0 und 1 enthalten darf.

    Verwenden Sie (bei geeigneter Behandlung des Falles d < 0) den Algorithmus:
        1. Setze b = 0 und m = 1.
        2. Solange d > 0 gilt, führe folgende Schritte durch:
            Addiere (d % 2) · m zu b.
            Setze d = d/2 und multipliziere m mit 10.
        3. b enthält nun die gesuchte Binärzahl." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine ganze Zahl ein : ");
        short d = scanner.nextShort();

        long b = 0;
        long m = 1;
        while(d > 0) {
            b = b + (d % 2) * m;
            d = (short) (d / 2);
            m = m * 10;
        }
        System.out.println("Die gesuchte Binärzahl lautet : " + b);
    }
}
