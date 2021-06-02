package com.company;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.27:
    "Der Algorithmus
        1. Lies den Wert von n ein.
        2. Setze i auf 3.
        3. Solange i < 2n, wiederhole:
            a. Erhöhe i um 1.
            b. Gib 2i1+1 aus.
    soll auf drei verschiedene Arten implementiert werden: Schreiben Sie jeweils
    ein Java-Programmstück, das diesen Algorithmus als while-, als for- und als
    do-while-Schleife realisiert. Sämtliche Programmstücke sollen die gleichen Aus-
    gaben erzeugen!" [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = scanner.nextInt();
        int i;

        // variant 1: for-loop
        System.out.println();
        System.out.println("Variant 1 : for-loop");
        System.out.println("-------------------------");
        for(i = 4; i-1 < 2*n ; i++)
            System.out.println(1.0/(2*i+1));

        // variant 2: while-loop
        System.out.println();
        System.out.println("Variant 1 : while-loop");
        System.out.println("-------------------------");
        i = 3;
        while(i < 2*n){
            i++;
            System.out.println(1.0/(2*i+1));
        }

        // variant 3: do-while loop
        System.out.println();
        System.out.println("Variant 1 : do-while loop");
        System.out.println("-------------------------");
        i = 3;
        do {
            i++;
            System.out.println(1.0/(2*i+1));
        } while( i < 2*n);
    }
}
