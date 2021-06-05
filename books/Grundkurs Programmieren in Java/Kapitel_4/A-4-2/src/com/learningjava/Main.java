package com.learningjava;

public class Main {
    /*
    Aufgabe 4.2:
    "Gegeben seien zwei Felder a und b vom Typ int[].
    Wie könnte ein Programmstück aussehen, das beide Felder miteinander vergleicht?
    Dabei seien zwei Felder genau dann gleich, wenn sie die gleiche Länge
    haben und alle ihre Komponenten paarweise übereinstimmen." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        int[] a = {0, 1, 2, 3, 4, 5};
        int[] b = {0, 1, 2, 3, 4, 5};

        // check length
        boolean isEqual = true;
        if(a.length == b.length) {
            for( int i = 0; i < a.length; i++) {
                if(a[i] != b[i]) {
                    isEqual = false;
                    break;
                }
            }
        }else
            isEqual = false;

        if(isEqual)
            System.out.println("a und b stimmen ueberein!");
        else
            System.out.println("a und b stimmen NICHT ueberein!");

    }
}
