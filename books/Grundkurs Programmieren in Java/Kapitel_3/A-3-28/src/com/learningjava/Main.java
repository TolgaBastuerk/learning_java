package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.28:
    "Schreiben Sie ein Programm, das unter Verwendung einer geeigneten Schleife eine
    ganze Zahl von der Tastatur einliest und deren Vielfache (für die Faktoren 1 bis
    10) ausgibt." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine ganze Zahl ein : ");
        int zahl = scanner.nextInt();

        System.out.print("Die Vielfachen : ");
        for(int i=1; i<=10; i++) {
            System.out.print(" " + (zahl*i));
        }
    }
}
