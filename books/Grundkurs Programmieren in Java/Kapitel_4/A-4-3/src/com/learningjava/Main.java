package com.learningjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*
    Aufgabe 4.3:
    "Schreiben Sie ein Kalenderprogramm, das Termine für die Jahre 2020 bis 2029 verwaltet.
    Verwenden Sie hierzu ein vierdimensionales Feld, und berücksichtigen Sie auch Schaltjahre." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static int einlesen(int untererGrenzwert, int obererGrenzwert, String name, String information) {
        var scanner = new Scanner(System.in);
        int eingabe = 0;
        boolean fertig = false;

        while(!fertig) {
            System.out.print(information);
             eingabe = scanner.nextInt();
            if(eingabe < untererGrenzwert || eingabe > obererGrenzwert) {
                System.out.println("Fuer die Auswahl des Parameters \"" + name +"\" sind nur Zahlen zwischen " +
                        untererGrenzwert + " und " + obererGrenzwert + " zulaessig!.");
                continue;
            }
            fertig = true;
        }
        return eingabe;
    }

    public static int[] terminAuswahl() {
        int[] auswahl = new int[4];

        auswahl[0] = einlesen(2000, 2009, "Jahr","Jahr (2000-2009): ");
        auswahl[1] = einlesen(1,12,"Monat","Monat (1-12): ");
        auswahl[2] = einlesen(1,31,"Tag","Tag (1-31): ");
        auswahl[3] = einlesen(0,23,"Uhrzeit","Uhrzeit (0-23): ");

        return auswahl;
    }


    public static void main(String[] args) {
	// write your code here
        int jahrAuswahl, monatAuswahl, tagAuswahl, uhrzeitAuswahl;
        int[] auswahl = new int[4];

        /* 1. Dimension : Jahr    - 10 (2020 bis 2029)
           2. Dimension : Monat   - 12
           3. Dimension : Tag     - 28 - 31 (Schaltjahre beruecksichtigen!)
           4. Dimension : Uhrzeit - 24 (0 bis 23) */
        String[][][][] kalender = new String[10][12][][];
        for(int jahr = 0; jahr < kalender.length; jahr++) {
            // Schaltjahre in 2000, 2004, 2008
            if((jahr==0) || (jahr==3) || (jahr==7))
                kalender[jahr][1] = new String[29][24];     // Februar hat 29 Tage im Schaltjahr
            else
                kalender[jahr][1] = new String[28][24];     // Februar hat 28 Tage

            for(int monat = 0; monat < kalender[jahr].length; monat++) {
                // Monate mit 31 Tagen: Januar, Maerz, Mai, Juli, August, Oktober, Dezember
                if((monat==0) || (monat==2) || (monat==4) || (monat==6) || (monat==7) || (monat==9) || (monat==11))
                    kalender[jahr][monat] = new String[31][24];

                // Monate mit 30 Tagen: April, Juni, September, November
                if((monat==3) || (monat==5) || (monat==8) || (monat==10))
                    kalender[jahr][monat] = new String[30][24];
                // Termine initialisieren
                for(int tag = 0; tag < kalender[jahr][monat].length; tag++)
                    for(int uhrzeit = 0; uhrzeit < 24; uhrzeit++)
                        kalender[jahr][monat][tag][uhrzeit] = "";
            }
        }

        System.out.println("\nWillkommen in der Terminkalender Applikation!");

        var scanner = new Scanner(System.in);
        boolean programBeenden = false;
        while(!programBeenden) {
            // Steuerung
            System.out.println("\nBitte waehlen Sie eine der folgenden Optionen aus:");
            System.out.println("- 1. Termin anlegen.");
            System.out.println("- 2. Termin anzeigen.");
            System.out.println("- 3. Programm beenden.");
            System.out.print("Auswahl eingeben (1-3): ");
            int steuerung = scanner.nextInt();

            if(steuerung == 1) {
                var scanner1 = new Scanner(System.in);
                System.out.println("\nAuswahl: Einen neuen Termin anlegen.");
                auswahl = terminAuswahl();
                jahrAuswahl = auswahl[0];
                monatAuswahl = auswahl[1];
                tagAuswahl = auswahl[2];
                uhrzeitAuswahl = auswahl[3];

                System.out.print("Termineintrag fuer den " + tagAuswahl + "." + monatAuswahl + "." + jahrAuswahl
                        + " - " + uhrzeitAuswahl + ":00 Uhr :");
                String eintrag = scanner1.nextLine();
                kalender[jahrAuswahl%10][monatAuswahl-1][tagAuswahl-1][uhrzeitAuswahl] = eintrag;

                System.out.println("Der Termineintrag wurde erfolgreich angelegt.\n");
            }


            if(steuerung == 2) {
                System.out.println("\nAuswahl: Einen bestehenden Termin anzeigen.");
                auswahl = terminAuswahl();
                jahrAuswahl = auswahl[0];
                monatAuswahl = auswahl[1];
                tagAuswahl = auswahl[2];
                uhrzeitAuswahl = auswahl[3];

                System.out.println("Termineintrag fuer den " + tagAuswahl + "." + monatAuswahl + "." + jahrAuswahl
                        + " - " + uhrzeitAuswahl + ":00 Uhr : " + kalender[jahrAuswahl%10][monatAuswahl-1][tagAuswahl-1][uhrzeitAuswahl]);
                System.out.println();
            }

            if(steuerung == 3) {
                System.out.println("\nAuswahl: Terminkalender Programm beenden.");
                System.out.println("Das Programm wird geschlossen. Auf Wiederstehen.");
                programBeenden = true;
            }
        }
    }
}
