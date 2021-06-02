package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.34:
    "Schreiben Sie ein Java-Programm, das zu einem beliebigen Datum den zugehö-
    rigen Wochentag ausgibt. Ein Datum soll jeweils durch drei ganzzahlige Werte
    t (Tag), m (Monat) und j (Jahr) vorgegeben sein." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie im Folgenden den gewünschten Datum ein.");
        System.out.print("Tag : ");
        int t = scanner.nextInt();
        System.out.print("Monat : ");
        int m = scanner.nextInt();
        System.out.print("Jahr : ");
        int j = scanner.nextInt();

        System.out.print("Der " + t + "." + m + "." + j + " ist ein ");

        int c, y, h;
        if (m <= 2)
        {
            m = m + 10;
            j = j - 1;
        }
        else
            m = m - 2;
        c = j/100;
        y = j%100;
        h = (((26*m - 2)/10) + t + y + y/4 + c/4 - 2*c) % 7;
        if (h < 0)
            h = h + 7;

        if (h == 0)
            System.out.println("Sonntag.");
        else if (h == 1)
            System.out.println("Montag.");
        else if (h == 2)
            System.out.println("Dienstag.");
        else if (h == 3)
            System.out.println("Mittwoch.");
        else if (h == 4)
            System.out.println("Donnerstag.");
        else if (h == 5)
            System.out.println("Freitag.");
        else
            System.out.println("Samstag.");
    }
}
