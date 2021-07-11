package com.learningjava;

public class Strecke {
    private Point p;
    private Point q;

    public Strecke (Point p, Point q) {
        this.p = p;
        this.q = q;
    }
    public String toString() {
        return p.toString() + "_" + q.toString();
    }
    public double getLaenge() {
        return Point.distance(p, q);
    }
    public void turn(double phi) {
        p.turn(phi);
        q.turn(phi);
    }

}
