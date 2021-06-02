package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.33:
    "Zwei verschiedene natürliche Zahlen a und b heißen befreundet, wenn die Summe
    der (von a verschiedenen) Teiler von a gleich b ist und die Summe der (von b
    verschiedenen) Teiler von b gleich a ist.
    Schreiben Sie ein Java-Programm, das jeweils zwei Zahlen einliest und entschei-
    det, ob diese miteinander befreundet sind. Arbeiten Sie mit einer geeigneten
    Schleife, in der alle Teiler einer Zahl bestimmt und aufsummiert werden." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */
    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("Erste ganze Zahl : ");
        int a = scanner.nextInt();
        System.out.print("Zweite ganze Zahl : ");
        int b = scanner.nextInt();

        int summeA = 0, summeB = 0;
        System.out.print("Teiler von " + a + " sind :");
        for( int i = 1; i < a; i++) {
            if(a % i == 0) {
                System.out.print(" " + i);
                summeA = summeA + i;
            }
        }

        System.out.println();
        System.out.print("Teiler von " + b + " sind :");
        for( int i = 1; i < b; i++) {
            if(b % i == 0) {
                System.out.print(" " + i);
                summeB = summeB + i;
            }
        }

        if(summeA == b && summeB == a)
            System.out.println();
            System.out.println("Die Zahlen " + a + " und " + b + " sind befreundet!");
    }
}
