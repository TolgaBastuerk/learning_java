package com.learningjava;
    /*
    Aufgabe 7.14

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class TestProgramm {

    public static void main(String[] args) {
	// write your code here
        var fahrrad = new Fahrzeug("Fahrrad",2,4.5);
        var auto = new Fahrzeug("Auto", 4, 1.9);
        System.out.println("Zustand 1:");
        fahrrad.fahreLos();
        fahrrad.status();
        System.out.println("Zustand 2:");
        auto.fahreLos();
        auto.status();
        System.out.println("Zustand 3:");
        fahrrad.halteAn();
        fahrrad.status();
        System.out.println("Zustand 4:");
        auto.halteAn();
        auto.status();
    }
}
