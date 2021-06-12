package com.learningjava;

public class Zwei {
    public Eins h;

    public Zwei (Eins eins) {
        h = eins;
    }

    public Object clone() {
        return new Zwei(h);
    }

}
