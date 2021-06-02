package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.24:
    "Schreiben Sie ein Programm, das mit Hilfe geschachtelter Schleifen ein aus
    *-Zeichen zusammengesetztes Dreieck auf der Konsole ausgibt. Die Benutzerin
    bzw. der Benutzer soll vorher nach der Anzahl der Zeilen gefragt werden." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("Anzahl der Zeilen  eingeben : ");
        int zeilen = scanner.nextInt();
        String print = "";
        for( int i = 1; i <= zeilen; i++) {
            print = print + "*";
            System.out.println(print);
        }
    }
}
