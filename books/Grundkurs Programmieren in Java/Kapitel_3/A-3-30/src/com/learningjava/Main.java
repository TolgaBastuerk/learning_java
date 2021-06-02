package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.30:
    "Programmieren Sie ein Zahlenraten-Spiel. Im ersten Schritt soll die Benutzerin
    bzw. der Benutzer begrüßt und kurz über die Regeln des Spiels informiert werden.
    Danach soll durch die Anweisung:
        int geheimZahl = (int) (99 * Math.random() + 1);
    eine Zufallszahl geheimZahl zwischen 0 und 100 generiert werden. Die Be-
    nutzerin bzw. der Benutzer des Programms soll nun versuchen, diese Zahl zu
    erraten. Programmieren Sie dazu eine Schleife, in der in jedem Durchlauf jeweils
    darüber informiert wird, um den wievielten Rateversuch es sich handelt,
    ein Rateversuch eingegeben werden kann und darüber informiert wird, ob die geratene
    Zahl zu groß, zu klein oder korrekt geraten ist.
    Diese Schleife soll so lange durchlaufen werden, bis die Zahl erraten ist." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */
    public static void main(String[] args) {
	// write your code here
        int geheimZahl = (int) (99 * Math.random() + 1);
        var scanner = new Scanner(System.in);

        System.out.print("Herzlich willkommen zum Zahlenraten-Spiel! Möchten Sie die Regeln lesen? (Y/N) : ");
        String antwort = scanner.next();
        if(antwort.equals("Y")) {
            System.out.println("\nSpielanleitung:\n" +
                    "Im Zahlenraten-Spiel wird eine zufällige Zahl zwischen 1 und 100 generiert.\n" +
                    "Ihre Aufgabe besteht darin die zufallsgenerierte Zahl richtig zu erraten. \n" +
                    "Dazu geben Sie rundenbasiert eine Zahl in die Konsole ein. Im Anschluss wird \n" +
                    "Ihre Eingabe mit der zufallsgenerierten Zahl verglichen und eine Rückmeldung ausgegeben. \n" +
                    "Das Spiel endet sobald Sie die Geheimzahl richtig geraten haben. \n" +
                    "Viel Spaß beim Spielen!\n");
        }

        int anzahlRunden = 0;
        while(true) {
            anzahlRunden ++;
            System.out.println("---------------------------------------------------------");
            System.out.println("Sie sind aktuell im " + anzahlRunden + ". Rateversuch.");
            System.out.print("Um welche Zahl handelt es sich? : ");
            int geraten = scanner.nextInt();

            if(geraten < geheimZahl)
                System.out.println("Sie haben leider zu niedrig geraten.");
            else if(geraten > geheimZahl)
                System.out.println("Sie haben leider zu hoch geraten.");
            else if(geraten == geheimZahl) {
                System.out.println("Herzlichen Glückwunsch! Sie haben die Geheimzahl richtig geraten!");
                break;
            }
        }
    }
}
