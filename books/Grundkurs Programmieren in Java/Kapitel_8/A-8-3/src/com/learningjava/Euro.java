package com.learningjava;
import java.text.NumberFormat;

public class Euro extends Waehrung {

    // Ein Euro ist so viel Dollar wert (Stand Dezember 1999)
    private static double kurs = 1;

    // Instanzvariable: Wert in Euro
    private double wert;

    // Konstruktor
    public Euro(double wert) {
        this.wert = wert;
    }

    // Deklaration der sonst abstrakten Methode dollarBetrag
    public double dollarBetrag() {
        return wert*kurs;
    }

    // Gibt den Wert der Waehrung in Euro zurueck
    public double euroBetrag() {
        return wert;
    }

    // Zugriff auf die private Klassenvariable
    public static void setEuroKurs(double neuerKurs) {
        kurs = neuerKurs;
    }

    @Override
    public String toString() {
        return NumberFormat.getCurrencyInstance().format(wert);
    }

}
