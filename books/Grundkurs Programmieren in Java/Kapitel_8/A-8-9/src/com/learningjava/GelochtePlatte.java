package com.learningjava;

public class GelochtePlatte extends MetallPlatte {

    private int anzahlLoecher;
    private double lochLaenge, lochBreite;
    private MetallPlatte[] loch;

    public GelochtePlatte(double laenge, double breite, int maxAnzahlLoecher) {
        super(laenge,breite);
        loch = new MetallPlatte[maxAnzahlLoecher];
        lochLaenge = laenge/maxAnzahlLoecher/2;
        lochBreite = breite/maxAnzahlLoecher/2;
    }

    public void neuesLochStanzen() {
        if(anzahlLoecher < loch.length) {
            loch[anzahlLoecher] = new MetallPlatte(lochLaenge, lochBreite);
            anzahlLoecher++;
            System.out.println("Loch #" + anzahlLoecher + " wurde gestanzt.");
        }

    }
    @Override
    public double flaeche() {
        return (super.flaeche() - (double)(anzahlLoecher)*(lochLaenge*lochBreite));
    }


}
