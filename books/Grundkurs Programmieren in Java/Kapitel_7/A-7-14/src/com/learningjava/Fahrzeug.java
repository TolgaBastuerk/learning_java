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
        this.faehrt = true;
    }
    public void halteAn() {
        this.faehrt = false;
    }
    public void status() {
        String fahrZustand = "";
        if (faehrt)
            fahrZustand = "faehrt";
        else
            fahrZustand = "steht";
        System.out.println(name + " " + fahrZustand + " auf " + anzahlReifen +
                " Reifen mit je " + reifenArt.aktuellerDruck() + " bar.");
    }

}
