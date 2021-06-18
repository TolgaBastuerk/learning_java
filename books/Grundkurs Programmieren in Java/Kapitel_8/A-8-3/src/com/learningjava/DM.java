package com.learningjava;

public class DM extends Euro{

    // Ein Euro ist zu viel DM wert
    private static double kursEuroZuDM = 1.995583;
    // Ein DM ist so viel Euro wert
    private static double kursDMzuEuro = 1.0/kursEuroZuDM;

    public DM(double dm) {
        super(dm*kursDMzuEuro);
    }
    public DM(Euro euro) {
        super(euro.euroBetrag());
    }

    public double waehrungsBetrag() {
        return euroBetrag()*kursEuroZuDM;
    }
}
