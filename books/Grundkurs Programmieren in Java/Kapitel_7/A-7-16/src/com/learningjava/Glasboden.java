package com.learningjava;

public class Glasboden {
    private double radius;

    public Glasboden(double r) {
        radius = r;
    }

    public void verkleinern(double x) {
        // verkleinert den Radius des Glasboden-Objekts um x
        radius = radius - x;
    }
    public double flaeche() {
        // liefert die Flaeche des Glasboden-Objekts
        return Math.PI * radius * radius;
    }
    public double umfang() {
        // liefert den Umfang des Glasboden-Objekts
        return 2 * Math.PI * radius;
    }
    public String toString() {
        // liefert die String-Darstellung des Glasboden-Objekts
        return "B(r=" + radius + ")";
    }
}
