package com.learningjava;

import java.util.Scanner;

public class Main {
    /*
    Aufgabe 3.35:
    "Schreiben Sie ein Java-Programm, das den Ostersonntag Algorithmus durchführt und
    das Datum des Ostersonntags für ein einzulesendes Jahr berechnet und ausgibt." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        int jahr, tag ,monat;
        int a, b, c, d, e, m, n, s;
        var scanner = new Scanner(System.in);
        System.out.print("Fuer welches Jahr moechten Sie den Ostersonntag ermitteln? : ");
        jahr = scanner.nextInt();

        a = jahr % 19;
        b = jahr % 4;
        c = jahr % 7;

        m = (8*(jahr/100) + 13)/25 - 2;
        s = jahr/100 - jahr/400 - 2;
        m = (15 + s - m) % 30;
        n = (6 + s) % 7;

        d = (m + 19*a) % 30;
        if( d==29)
            d = 28;
        else if((d == 28) && (a >= 11))
            d = 27;
        e = (2*b + 4*c + 6*d + n) % 7;

        tag = 21 + d + e + 1;
        if(tag > 31){
            tag = tag % 31;
            monat=4;
        }else
            monat = 3;

        System.out.println("Im Jahr " + jahr + " ist der Ostersonntag am " + (int)tag + "." + (int)monat + ".");

    }
}
