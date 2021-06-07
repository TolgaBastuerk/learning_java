package com.learningjava;

import java.util.Scanner;

public class Main {

    public static String readLine(String label) {
        var scanner = new Scanner(System.in);
        System.out.print(label);
        return scanner.nextLine();
    }
    public static int readInteger(String label) {
        var scanner = new Scanner(System.in);
        System.out.print(label);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
	    // Benoetigte Variablen
        Adresse[] adressen = new Adresse[20];
        Adresse adr;
        boolean fertig = false;
        var scanner = new Scanner(System.in);

        // Initialisiere das Feld
        for(int i = 0; i < adressen.length; i++) {
            adressen[i] = new Adresse();
        }

        adr = adressen[0];

        // Starte das Program mit einer huebschen Ausgabe
        System.out.println("=====================");
        System.out.println("Adressverwaltung");
        System.out.println("=====================");

        // Schleifenbeginn
        while(!fertig) {
            // Menue
            System.out.println(" ");
            System.out.println("1 = Adresseingabe");
            System.out.println("2 = Adressausgabe");
            System.out.println("3 = Aktuelle Adresse wechseln");
            System.out.println("4 = Programm beenden");

            int auswahl = readInteger("Ihre Wahl: ");

            // Fallunterscheidung
            switch(auswahl) {
                case 1: // Adresse eingeben
                    adr.name            = readLine("Name      : ");
                    adr.strasse         = readLine("Strasse   : ");
                    adr.hausnummer      = readInteger("Hausnummer: ");
                    adr.wohnort         = readLine("Wohnort   : ");
                    adr.postleitzahl    = readInteger("PLZ       : ");
                    adr.mail            = readLine("E-Mail    : ");
                    adr.telefonnummer   = readLine("Telefon   : ");
                    adr.kommentar       = readLine("Kommentar : ");
                    break;
                case 2: // Adresse ausgeben
                    System.out.println(adr.name);
                    System.out.println(adr.strasse + " " + adr.hausnummer);
                    System.out.println(adr.postleitzahl + " " + adr.wohnort);
                    System.out.println("E-Mail:  " + adr.mail);
                    System.out.println("Telefon: " + adr.telefonnummer);
                    System.out.println("Kommentar: " + adr.kommentar);
                    break;
                case 3: // Adresse wechseln
                    int nr = readInteger("Welche Adresse (0 bis 19) ?");

                    if(nr >= 0 && nr < adressen.length)
                        adr = adressen[nr];
                    else
                        System.out.println("Eingabefehler!");
                    break;
                case 4: // Programm beenden
                    fertig = true;
                    break;
                default: // Falsche Zahl eingegeben
                    System.out.println("Eingabefehler!");
            }
        } // Schleifenende
    } // Ende des Hauptprogramms
} // Ende des Programms
