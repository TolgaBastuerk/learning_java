package com.learningjava;

public class Franc extends Euro{

    // Ein Euro ist so viel Franc wert
    private static double kursEuroZuFranc = 6.55957;
    // Ein Franc ist so viel Euro wert
    private static double kursFrancZuEuro = 1.0/kursEuroZuFranc;

    public Franc(double franc) {
        super(franc*kursFrancZuEuro);
    }
    public Franc(Euro euro) {
        super(euro.euroBetrag());
    }

    public double waehrungsBetrag() {
        return euroBetrag()*kursEuroZuFranc;
    }
}
