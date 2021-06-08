package com.learningjava;

public class Main {
    /*
    Aufgabe 5.1:
    "Schreiben Sie eine Methode, die den Tangens einer double-Zahl, die als Parameter
     übergeben wird, berechnet. Implementieren Sie den Tangens gemäß der Formel
     tan(x) = sin(x)/ cos(x). Sie dürfen die Methoden Math.sin und Math.cos
     zur Berechnung von Sinus und Cosinus verwenden, jedoch innerhalb der Methode
     keine einzige Variable vereinbaren." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static double tan(double a) {
        return Math.sin(a)/Math.cos(a);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("tan(1.0) = " + tan(1.0));
        System.out.println("tan(5.0) = " + tan(5.0));
        System.out.println("tan(15.25) = " + tan(15.25));
    }
}
