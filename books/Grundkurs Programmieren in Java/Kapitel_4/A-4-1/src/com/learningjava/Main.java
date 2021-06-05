package com.learningjava;

public class Main {
    /*
    Aufgabe 4.1:
    " Gegeben sei die Deklaration/Erzeugung
        int[][][][] Feld = new int[6][10][8][];
    Ergänzen Sie deren (noch unvollständige) alternative Form" [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        //  gegebene Variante
        int[][][][] Feld1 = new int[6][10][8][];
        // Dimensionen ueberpruefen
        System.out.println("Original Dim 1: " + Feld1.length);
        System.out.println("Original Dim 2: " + Feld1[0].length);
        System.out.println("Original Dim 3: " + Feld1[0][0].length);

        // alternative Variante
        int[][][][] Feld2 = new int[6][][][];
        for (int i = 0; i < Feld2.length; i++) {
            Feld2[i] = new int[10][][];
            for (int j = 0; j < Feld2[i].length; j++) {
                Feld2[i][j] = new int[8][];
            }
        }
        // Dimensionen ueberpruefen
        System.out.println("Var1 Dim 1: " + Feld2.length);
        System.out.println("Var1 Dim 2: " + Feld2[0].length);
        System.out.println("Var1 Dim 3: " + Feld2[0][0].length);


    }
}
