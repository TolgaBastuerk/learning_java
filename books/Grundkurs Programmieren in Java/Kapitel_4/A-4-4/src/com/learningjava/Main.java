package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 4.4:
    "Schreiben Sie ein Programm, das zuerst Zahlen von der Tastatur einliest, diese
    dann der Größe nach sortiert und auf dem Bildschirm ausgibt." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.println("Willkommen zum Zahlensortierer.");

        // Feld deklarieren
        System.out.print("Bitte geben Sie die laenge des Feldes an: ");
        int laenge = scanner.nextInt();
        int[] feld = new int[laenge];

        // Feld initialisieren
        for(int i = 0; i < feld.length; i++) {
            System.out.print(i+1 + ". Zahl: ");
            feld[i] = scanner.nextInt();
        }

        // Zahlen sortieren
        for(int i = 0; i < feld.length - 1; i++) {
            for(int j = feld.length - 1; j > i; j--) {
                if(feld[j] < feld[j-1]) {
                    feld[j] = feld[j] * feld[j-1];
                    feld[j-1] = feld[j] / feld[j-1];
                    feld[j] = feld[j] / feld[j-1];
                }
            }
        }

        // Zahlen ausgeben
        System.out.println("Sortierung abgeschlossen.");
        System.out.println("Ergebnis: ");
        for (int element : feld) {
            System.out.print(element + " ");
        }
    }
}
