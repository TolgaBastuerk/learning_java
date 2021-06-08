package com.learningjava;

import java.util.Arrays;

public class Main {
    /*
    Aufgabe 5.2:
    "Schreiben Sie eine Methode swappedCopy, die als Ergebnis den „gespiegelten“
     Inhalt eines eindimensionalen Arrays a vom Typ int[] liefert. Das heißt, das
     erste Element von a ist das letzte Element von swappedCopy(a) und so weiter.
     Hierbei dürfen keine Seiteneffekte auftreten, die Feldkomponenten von a sollen
     also unverändert bleiben.
     Schreiben Sie eine weitere Methode swap, die ebenfalls über diese Funktion ver-
     fügt, aber den Rückgabetyp void besitzt. Hierzu sollen bewusst Seiteneffekte ein-
     gesetzt werden; das Ergebnis soll somit am Ende der Methode in a selbst stehen." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static int[] swappedCopy(int[] a) {
        int[] copy = new int[a.length];
        for(int i = 0; i < a.length; i++)
            copy[i] = a[a.length - 1 - i];
        return copy;
    }

    public static void swap(int[] a) {
        for(int i = 0; i < a.length/2; i++) {
            a[i]                = a[i] * a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i] / a[a.length - 1 - i];
            a[i]                = a[i] / a[a.length - 1 - i];
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] test = {1, 2, 3, 4, 5, 6};
        System.out.println("swappedCopy(test) = " + Arrays.toString(swappedCopy(test)));
        System.out.println("vor \"swap(test)\" : test = " + Arrays.toString(test));
        swap(test);
        System.out.println("nach \"swap(test)\" : test = " + Arrays.toString(test));
    }
}
