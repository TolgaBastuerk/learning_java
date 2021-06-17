package com.learningjava;

public class Lire extends Euro{

    // Ein Euro ist zu viel Lire wert
    private static double kursEuroZuLire = 1936.27;
    // Eine Lire ist zu viel Euro wert
    private static double kursLireZuEuro = 1.0/kursEuroZuLire;

    public Lire(double lire) {
        super(lire*kursLireZuEuro);
    }
    public Lire(Euro euro) {
        super(euro.euroBetrag());
    }

    public double waehrungsBetrag() {
        return euroBetrag()*kursEuroZuLire;
    }
}
