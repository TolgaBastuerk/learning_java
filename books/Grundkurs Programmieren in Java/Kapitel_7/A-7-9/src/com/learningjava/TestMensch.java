package com.learningjava;

public class TestMensch {
    public static void main(String[] args) {
        // teste Konstruktor
        var einMensch = new Mensch(18,true,"Peter","Jaeger");
        var einAndererMensch = new Mensch(17,false, "Paula", "Miller");
        // teste toString()-Methode
        System.out.println(einMensch);
        // teste aelterAls()-Methode
        System.out.println(einMensch.aelterAls(einAndererMensch));

    }
}
