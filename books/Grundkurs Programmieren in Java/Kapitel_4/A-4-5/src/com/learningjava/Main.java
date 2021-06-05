package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 4.5:
    "Ein magisches Quadrat ist eine Tabelle mit n Zeilen und n Spalten, gefüllt mit den
    ersten n^2 natürlichen Zahlen (beginnend mit 1), wobei die Summe der Zahlen in jeder
    Zeile, Spalte und Diagonale gleich ist. Schreiben Sie ein Programm, das ein magisches
    Quadrat der Größe n × n erzeugt und auf dem Bildschirm ausgibt." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        int n = 0;
        int summe = 0;

        // Dimension des magischen Quadrats einlesen
        System.out.println("Bitte geben Sie eine ganze Zahl fuer die Dimension des magischen Quadrats ein. " +
                "Die Dimension muss groesser als 2, kleiner als 10 und ungerade sein.");
        while(true) {
            System.out.print("Dimension eingeben: ");
            n = scanner.nextInt();
            if(n < 2)
                System.out.println("Die Dimension muss groesser als 2 sein!");
            else if(n > 10)
                System.out.println("Die Dimension muss kleiner als 10 sein!");
            else if(n % 2 == 0)
                System.out.println("Die Dimension muss ungerade sein!");
            else
                break;
        }

        // Feld erzeugen
        int[][] quadrat = new int[n][n];

        // Zeile und Spalte initialisieren
        int zeile = n/2;
        int spalte = n/2 + 1;

        // magisches Quadrat mit Werten fuellen
        for(int i = 1; i <= n * n; i++) {
            quadrat[zeile][spalte] = i;
            spalte ++;
            zeile --;
            if(zeile < 0)
                zeile = n - 1;
            if(spalte==n)
                spalte = 0;
            if(quadrat[zeile][spalte] != 0) {
                zeile ++;
                spalte ++;
                if(zeile == n)
                    zeile = 0;
                if(spalte == n)
                    spalte = 0;
            }
        }

        // magisches Quadrat ausgeben
        System.out.println("\nAusgabe des magischen Quadrats:");
        for(zeile = 0; zeile < n; zeile++) {
            for( spalte = 0; spalte < n; spalte++) {
                if(spalte == n-1)
                    if(quadrat[zeile][spalte] < 10)
                        System.out.print(" " + quadrat[zeile][spalte] + "\n");
                    else
                        System.out.print(quadrat[zeile][spalte] + "\n");
                else
                    if(quadrat[zeile][spalte] < 10)
                        System.out.print(" " + quadrat[zeile][spalte] + " ");
                    else
                        System.out.print(quadrat[zeile][spalte] + " ");
            }
        }

        // magisches Quadrat verifizieren
        System.out.println("\nKontrolle des magischen Quadrats:");
        // Summe der Zeilen
        for(zeile = 0; zeile < n; zeile++) {
            System.out.print("\nSumme Zeile " + (zeile+1) + ": ");
            summe = 0;
            for( spalte = 0; spalte < n; spalte++) {
                summe = summe + quadrat[zeile][spalte];
                System.out.print(quadrat[zeile][spalte]);
                if(spalte == n - 1)
                    System.out.print(" = " + summe);
                else
                    System.out.print(" + ");
            }
        }
        // Summe der Spalten
        System.out.println();
        for(spalte = 0; spalte < n; spalte++) {
            System.out.print("\nSumme Spalte " + (spalte+1) + ": ");
            summe = 0;
            for( zeile = 0; zeile < n; zeile++) {
                summe = summe + quadrat[zeile][spalte];
                System.out.print(quadrat[zeile][spalte]);
                if(zeile == n - 1)
                    System.out.print(" = " + summe);
                else
                    System.out.print(" + ");
            }
        }
        // summe der diagonalen
        System.out.println();
        summe = 0;
        System.out.print("\nSumme Diagonale 1: ");
        for(int i = 0; i < n; i++) {
            summe = summe + quadrat[i][i];
            System.out.print(quadrat[i][i]);
            if(i == n - 1)
                System.out.print(" = " + summe);
            else
                System.out.print(" + ");
        }
        summe = 0;
        System.out.print("\nSumme Diagonale 2: ");
        for(int i = 0; i < n; i++) {
            summe = summe + quadrat[n-i-1][i];
            System.out.print(quadrat[n-i-1][i]);
            if(i == n - 1)
                System.out.print(" = " + summe);
            else
                System.out.print(" + ");
        }


    }
}
