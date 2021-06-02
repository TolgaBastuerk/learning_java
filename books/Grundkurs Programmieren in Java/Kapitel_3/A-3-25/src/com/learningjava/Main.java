package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.25:
    "Schreiben Sie ein Java-Programm, das eine int-Zahl z mit 0 < z < 10000 einliest,
    ihre Quersumme berechnet und die durchgeführte Berechnung sowie den Wert
    der Quersumme wie nachfolgend dargestellt ausgibt." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        var calculator = new Calculator();

        System.out.print("Positive ganze Zahl eingeben : ");
        calculator.setNumber(scanner.nextInt());
        calculator.calculateChecksum();
    }
}
