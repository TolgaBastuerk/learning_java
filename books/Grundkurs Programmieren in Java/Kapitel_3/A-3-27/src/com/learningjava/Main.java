package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.27:
    "Schreiben Sie ein Programm, das eine positive ganze Zahl einliest, sie in ihre Zif-
    fern zerlegt und die Ziffern in umgekehrter Reihenfolge als Text ausgibt. Verwen-
    den Sie dabei eine while-Schleife und eine switch-Anweisung." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */
    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("Positive ganze Zahl : ");

        int eingabe = scanner.nextInt();
        System.out.print("Zerlegt rueckwaerts : ");

        while(eingabe > 0) {
            int ziffer = eingabe % 10;
            eingabe = eingabe / 10;

            switch(ziffer) {
                case 0 :
                    System.out.print("null");
                    break;
                case 1 :
                    System.out.print("eins");
                    break;
                case 2 :
                    System.out.print("zwei");
                    break;
                case 3 :
                    System.out.print("drei");
                    break;
                case 4 :
                    System.out.print("vier");
                    break;
                case 5 :
                    System.out.print("fuenf");
                    break;
                case 6 :
                    System.out.print("sechs");
                    break;
                case 7 :
                    System.out.print("sieben");
                    break;
                case 8 :
                    System.out.print("acht");
                    break;
                case 9 :
                    System.out.print("neun");
                    break;
            }
            System.out.print(" ");
        }
    }
}
