package com.learningjava;

public class Reifen {
    private double druck;

    public Reifen(double luftdruck) {
        druck = luftdruck;
    }

    public double aktuellerDruck() {
        return druck;
    }
}
