package com.learningjava;

public class Sandwich extends Vesper {
    Brot b = new Brot();
    Wurst w = new Wurst();
    Salat s = new Salat();

    public Sandwich() {
        System.out.println("Sandwich()");
    }
}
