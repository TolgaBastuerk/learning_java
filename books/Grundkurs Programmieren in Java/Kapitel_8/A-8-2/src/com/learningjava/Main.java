package com.learningjava;
import java.util.Scanner;

public class Main {
    /*
    Aufgabe 8.2:
    "Verwenden Sie die Klassen DM, Lire und Franc aus Aufgabe 8.1, um einen
    Währungskalkulator zu schreiben. Das Programm soll einen Geldbetrag in DM
    einlesen und seinen Wert in Euro, Lire und Franc zurückgeben."

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	    var scanner = new Scanner(System.in);
        System.out.println("Willkommen zum Waehrungskalkulator.");
        System.out.print("Bitte geben Sie einen Betrag in DM an: ");
        double geldBetrag = scanner.nextDouble();

        DM dm = new DM(geldBetrag);
        Lire lire = new Lire(dm);
        Franc franc = new Franc(dm);

        System.out.println();
        System.out.println(geldBetrag + " DM ergeben " + dm.euroBetrag() + " Euro.");
        System.out.println(geldBetrag + " DM ergeben " + lire.waehrungsBetrag() + " Lire.");
        System.out.println(geldBetrag + " DM ergeben " + franc.waehrungsBetrag() + " Franc.");




    }
}
