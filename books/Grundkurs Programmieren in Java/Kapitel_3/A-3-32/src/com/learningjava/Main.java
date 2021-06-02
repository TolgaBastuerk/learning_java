package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.32:
    "Schreiben Sie ein Programm, das einen Weihnachtsbaum mit Hilfe von for-
    Schleifen zeichnet. Lesen Sie die gewünschte Höhe des Baumes von der Tastatur
    ein, und geben Sie entsprechend einen Baum aus." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die gewünschte Baumhöhe an : ");
        int hoehe = scanner.nextInt();

        // Baum erstellen
        String baumstamm = "";
        for( int i = 1; i <= hoehe; i++) {
            String baum = "";
            // Leerzeichen einfuegen
            for( int j = 1; j <= hoehe - i; j++)
                baum = baum + " ";
            // Sterne einfuegen
            for( int k = 1; k <= (i-1)*2+1; k++) {
                if( i == 1)
                    baumstamm = baum + "I";
                baum = baum + "*";
            }
            System.out.println(baum);
        }
        System.out.println(baumstamm);



    }
}
