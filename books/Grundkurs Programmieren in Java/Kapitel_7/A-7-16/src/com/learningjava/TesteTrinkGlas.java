package com.learningjava;

public class TesteTrinkGlas {

    public static void main(String[] args) {
	// write your code here
        var g = new TrinkGlas(50, new Glasboden(100));
        while(g.flaeche() < g.fuellMenge()/8) {
            g.verkleinern(5);
            System.out.println(g + ", bedeckte Innenflaeche: " + g.flaeche() + ", Fuellmenge: " + g.fuellMenge());
        }
    }
}
