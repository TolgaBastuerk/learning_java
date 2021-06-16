package com.learningjava;

public class TrinkGlas {
    private Glasboden boden;
    private double fuellStand;


    public TrinkGlas(double fuellStand, Glasboden boden) {
        this.boden = boden;
        this.fuellStand = fuellStand;
    }

    public void verkleinern (double x) {
        boden.verkleinern(x);
        fuellStand = fuellStand - x;
    }

    public double flaeche() {
        return boden.flaeche() + boden.umfang() * fuellStand;
    }

    public double fuellMenge() {
        return boden.flaeche() * fuellStand;
    }

    public String toString() {
        return "G(" + boden + ",s=" + fuellStand + ")";
    }
}
