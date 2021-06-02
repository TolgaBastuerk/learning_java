package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.26:
    "Ein neuer Science-Fiction-TV-Sender will sein Programmschema nur noch in ga-
    laktischer Zeitrechnung angeben. Dazu sollen Sie ein Java-Programm schreiben,
    das eine Datums- und Uhrzeitangabe in Erdstandardzeit in eine galaktische Stern-
    zeit umrechnet.
    Eine Sternzeit wird als Gleitkommazahl angegeben, wobei die Vorkommastellen
    die Tageszahl (das Datum) und die Nachkommastellen die galaktischen Milli-
    Einheiten (die Uhrzeit) angeben. Der Tag 1 in der galaktischen Zeitrechnung ent-
    spricht gerade dem 1.1.1111 auf der Erde. Ein Galaxis-Tag hat 1000 Milli-Einheiten
    und dauert 1440 Erdminuten, also zufälligerweise genau 24 Stunden. Die Stern-
    zeit 5347.789 entspricht somit gerade dem 25.8.1125, 18.57 Uhr Erdstandardzeit.
    In Ihrem Programm müssen Sie zu einer durch die Werte jahr, monat, tag,
    stundeund minutevorgegebenen Erd-Datum- und Erd-Zeit-Angabe zunächst
    die Anzahl der Tage bestimmen, die seit dem 1.1.1111 bereits vergangen sind.
    Dabei brauchen Schaltjahre nicht berücksichtigt zu werden. Zu dieser Zahl muss
    dann der gebrochene Zeit-Anteil addiert werden, der sich ergibt, wenn man die
    durch die Uhrzeit festgelegten Erdminuten in Bruchteile eines Tages umrechnet und
    diese auf drei Ziffern nach dem Dezimalpunkt rundet." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here

        System.out.println("Bitte geben Sie im Folgenden die gewünschte Erdzeit an.");
        var scanner = new Scanner(System.in);
        System.out.print("Tag : ");
        int tag = scanner.nextInt();
        System.out.print("Monat : ");
        int monat = scanner.nextInt();
        System.out.print("Jahr : ");
        int jahr = scanner.nextInt();
        System.out.print("Stunde : ");
        int stunde = scanner.nextInt();
        System.out.print("Minute : ");
        int minute = scanner.nextInt();
        System.out.println("Sie haben folgende Erdzeit eingegeben : " + tag + "." + monat + "." + jahr + " " + stunde + ":" + minute);

        double sternzeit = tag + 30 * (monat - 1) + 365 * (jahr - 1111);
        int sternstunden = (int) (60 * stunde + minute * 1000 / 1440.0);
        sternzeit = sternzeit + (double) sternstunden / 1000;
        System.out.println("Die galaktische Zeit betraegt : " + sternzeit);

    }

}
