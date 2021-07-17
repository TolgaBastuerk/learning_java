package com.learningjava;

    /**
        Aufgabe 10.6 aus [1]

        Quelle:
        [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
    */

public class RateMal {

    public static<T> void ausgabe(T... eingabe) {
        System.out.print("Ausgabe: ");
        for(Object o : eingabe)
            System.out.print(o + " ");
        System.out.println();
    }

    public static <T extends Comparable<T>> T[] tueWas(T... eingabe) {
        eingabe = eingabe.clone();
        for(int i = eingabe.length - 1; i > 0; i--)
            for(int j = 0; j < i ; j++)
                if(eingabe[j].compareTo(eingabe[j+1]) > 0) {
                    T tmp = eingabe[j];
                    eingabe[j] = eingabe[j+1];
                    eingabe[j+1] = tmp;
                }
        return eingabe;
    }

    public static void main(String[] args) {
	// write your code here
        ausgabe(tueWas(Boolean.TRUE,Boolean.FALSE));
        ausgabe(tueWas("welt","schoene","du","hallo"));
    }
}
