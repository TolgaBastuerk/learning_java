package com.learningjava;
import java.util.Scanner;
    /*
    Aufgabe 8.9

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class TestPlatte {

    public static GelochtePlatte lochen (MetallPlatte mp) {
        var scanner = new Scanner(System.in);
        GelochtePlatte neuePlatte = new GelochtePlatte(mp.laenge, mp.breite, 10);
        System.out.print("Wie viele Loecher sollen gestanzt werden? : ");
        int anzahlLoecher = scanner.nextInt();
        for( int i = 0; i < anzahlLoecher; i ++)
            neuePlatte.neuesLochStanzen();
        return neuePlatte;
    }

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);
        System.out.print("Laenge fuer Metallplatte 1 eingeben : ");
        double laenge1 = scanner.nextDouble();
        System.out.print("Breite fuer Metallplatte 1 eingeben : ");
        double breite1 = scanner.nextDouble();
        System.out.print("Laenge fuer Metallplatte 2 eingeben : ");
        double laenge2 = scanner.nextDouble();
        System.out.print("Breite fuer Metallplatte 2 eingeben : ");
        double breite2 = scanner.nextDouble();

        MetallPlatte platte1 = new MetallPlatte(laenge1, breite1);
        MetallPlatte platte2 = new MetallPlatte(laenge2, breite2);
        System.out.println("Metallplatte 1 ist schwerer als Metallplatte 2 : " + platte1.schwererAls(platte2));

        GelochtePlatte gelochtePlatte1 = lochen(platte1);
        GelochtePlatte gelochtePlatte2 = lochen(platte2);

        System.out.println("Gelochte Platte 1 ist schwerer als Gelochte Platte 2 : " + gelochtePlatte1.schwererAls(gelochtePlatte2));

        System.out.println("Platte 1 Flaeche : " + platte1.flaeche());
        System.out.println("Platte 2 Flaeche : " + platte2.flaeche());
        System.out.println("Gelochte Platte 1 Flaeche : " + gelochtePlatte1.flaeche());
        System.out.println("Gelochte Platte 2 Flaeche : " + gelochtePlatte2.flaeche());
    }
}
