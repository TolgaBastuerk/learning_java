package com.learningjava;

public class Strecke {
    private Punkt p;
    private Punkt q;

    public Strecke(Punkt p, Punkt q) {
        this.p = p;
        this.q = q;
    }
    public void read() {
        System.out.println("Randpunkte fuer p einlesen:");
        p.read();
        System.out.println("Randpunkte fuer q einlesen:");
        q.read();
    }
    public double getLaenge() {
        double diffX = q.getX() - p.getX();
        double diffY = q.getY() - p.getY();
        return Math.sqrt( Math.pow(diffX,2) + Math.pow(diffY,2) );
    }
    public String toString() {
        return p.toString() + "_" + q.toString();
    }


}
