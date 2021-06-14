package com.learningjava;
    /*
    Aufgabe 7.13

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Fahrzeug {
    private String name;
    private int anzahlReifen;
    private Reifen reifenArt;
    private boolean faehrt;

    public Fahrzeug(String name, int anzahlReifen, double druck) {
        this.name = name;
        this.anzahlReifen = anzahlReifen;
        this.reifenArt = new Reifen(druck);
        this.faehrt = false;
    }

    public void fahreLos() {
        System.out.println("Fahre los...");
        this.faehrt = true;
    }
    public void halteAn() {
        System.out.println("Halte an...");
        this.faehrt = false;
    }
    public void status() {
        System.out.println("Bezeichnung: " + name + "\n" +
                "Fahrzustand: " + faehrt + "\n" +
                "Reifenanzahl: " + anzahlReifen + "\n" +
                "Luftdruck: " + Double.toString(reifenArt.aktuellerDruck()));
    }

    public static void main(String[] args) {
	// write your code here
        var fahrzeug = new Fahrzeug("Truck",4,2.0);
        fahrzeug.status();
        fahrzeug.fahreLos();
        fahrzeug.status();
        fahrzeug.halteAn();
        fahrzeug.status();
    }
}
