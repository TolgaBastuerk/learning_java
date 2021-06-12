package com.learningjava;

public class Krach extends Klang {
    private int rauschen, lautstaerke;
    public static int grundRauschen = 4;

    public Krach(int l, int b, int h) {
        super(b, h);
        lautstaerke = l;
        rauschen = grundRauschen;
    }

    public void mehrPower(int b) {
        baesse += b;
        if (baesse > 10) {
            lautstaerke -= 1;
        }
    }

    public void mehrPower(int l, int b) {
        lautstaerke += l;
        this.mehrPower(b);
    }
}
