package com.learningjava;

public class Eins {
    public long f;
    public static long g = 2;

    public Eins (long f) {
        this.f = f;
    }

    public Object clone() {
        return new Eins(f + g);
    }

}
