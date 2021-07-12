package com.learningjava;
    /*
    Aufgabe 9.4 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Main {

    // Bestimme eine Zufallszahl zwischen 0 und 0.5
    public static double gibZufallszahlBisEinhalb() throws Exception {
        double res = Math.random();
        if(res > 0.5)
            throw new Exception("Zahl zu gross");
        return res;
    }

    // Hauptprogramm
    public static void main(String[] args) {
        double zahl;
	    // Bestimme eine Zufallszahl zwischen 0 und 0.5
        try {
            zahl = gibZufallszahlBisEinhalb();
        }
        // Falls etwas schief geht (Exception) verwende die Zahl 0.5
        catch(Exception e) {
            zahl = 0.5;
        }
        System.out.println(zahl);
    }
}
