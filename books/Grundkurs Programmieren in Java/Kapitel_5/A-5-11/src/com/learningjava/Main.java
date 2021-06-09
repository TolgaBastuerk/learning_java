package com.learningjava;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Aufgabe 5.11:
    "Schreiben Sie ein Java-Programm, das eine beliebige Anzahl von double-Werten
    einliest und so in ein Feld abspeichert, dass die mehrfach auftretenden Werte
    unmittelbar hintereinander angeordnet sind. Außerdem sollen die Werte insgesamt
    so angeordnet sein, dass zunächst die positiven und dann erst die negativen Zahlen
    im Feld stehen." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static double[] enter(double d, int k, double[] dFeld) {
        // erstelle ein neues Feld, welches ein Element mehr umfasst
        double[] dFeldNeu = new double[dFeld.length+1];
        if(k < 0) {
            // schreibe den neuen Wert d in den ersten Eintrag
            dFeldNeu[0] = d;
            // kopiere alle uebrigen Eintraege in das neue Feld
            for(int i = 1; i < dFeldNeu.length; i++)
                dFeldNeu[i] = dFeldNeu[i-1];
        }else if(k > dFeld.length) {
            // kopiere alle Eintrage in das neue Feld
            for(int i = 1; i < dFeld.length; i++)
                dFeldNeu[i] = dFeld[i];
            // schreibe den neuen Wert d in den letzten Eintrag
            dFeldNeu[dFeldNeu.length-1] = d;
        } else {
            // kopiere alle Elemente vor dem k`ten Element in das neue Feld
            for(int i = 0; i < k; i++)
                dFeldNeu[i] = dFeld[i];
            // schreibe den neuen Wert d in den k`ten Eintrag
            dFeldNeu[k] = d;
            // kopiere alle Elemente nach dem k`ten Element in das neue Feld
            for(int i = k; i < dFeld.length; i++)
                dFeldNeu[i+1] = dFeld[i];
        }
        return dFeldNeu;
    }

    public static int position(double d, double[] dFeld) {
        for(int i = 0; i < dFeld.length; i++) {
            if(dFeld[i] == d)
                return i;
        }
        if(d > 0)
            return 0;
        else
            return dFeld.length;
    }

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        double[] feld = new double[0];
        double eingabe = 0;

        while(true) {
            System.out.print("Neues Element eingeben: ");
            eingabe = scanner.nextDouble();
            if(eingabe == 0)
                break;
            feld = enter(eingabe, position(eingabe,feld), feld);
        }
        System.out.println("Sortiertes Feld: " + Arrays.toString(feld));
    }
}
