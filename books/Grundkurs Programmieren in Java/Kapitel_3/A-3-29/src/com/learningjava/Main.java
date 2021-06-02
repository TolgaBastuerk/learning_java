package com.learningjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.29:
    "Schreiben Sie ein Programm zur Zinseszinsberechnung. Nach Eingabe des anzu-
    legenden Betrages, des Zinssatzes und der Laufzeit der Geldanlage soll der Wert
    der Investition nach jedem Jahr ausgegeben werden." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);

        System.out.print("Anzulegender Geldbetrag in Euro : ");
        double anfangskapital = scanner.nextDouble();
        System.out.print("Jahreszins (z. B. 0,1 fuer 10 Prozent) : ");
        double zinssatz = scanner.nextDouble();
        System.out.print("Laufzeit (in Jahren) : ");
        double laufzeit = scanner.nextDouble();

        for(int i=1; i<= (int)laufzeit; i++) {
            double zinseszins = anfangskapital * Math.pow(1 + zinssatz,i);
            System.out.println("Wert nach " + i + " Jahren: " + zinseszins);
        }
    }
}
