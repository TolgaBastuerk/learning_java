package com.learningjava;
import java.util.Scanner;
    /*
    Aufgabe 8.11:
    "Sie sollen unter Verwendung der Klassen DameFigurund Bildschirmaus Auf-
    gabe 8.10 eine Klasse DSpielschreiben, die ein sehr einfaches Beute-Jäger-Spiel
    für zwei Personen realisiert. Bei diesem Spiel stellt ein Spieler eine Dame (die Beu-
    te) auf ein beliebiges Feld auf dem Schachbrett (diese Beute bleibt jedoch für den
    Gegner unsichtbar). Danach setzt der Gegner ebenfalls eine Dame (den Jäger) auf
    ein beliebiges Feld auf dem Schachbrett und versucht, auf dem Feld mit der Beu-
    te zu landen. Trifft er nicht bereits mit dem Setzen seiner Dame auf die Beute, so
    hat er insgesamt 10 Versuche, um mit einem Damezug (beliebig viele Felder in ei-
    ner Richtung, entweder horizontal, vertikal oder diagonal) auf dem Feld mit der
    Beute zu landen." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class DSpiel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	// write your code here
        System.out.println("Willkommen beim Beute-Jeager Spiel!");
        System.out.println();

        System.out.println("Positionieren Sie die Beute.");
        System.out.print("X-Position (A-H) eingeben: ");
        char xPos1 = scanner.next().charAt(0);
        System.out.print("Y-Position (1-8) eingeben: ");
        int yPos1 = scanner.nextInt();
        System.out.print("Farbe eingeben: ");
        String farbe1 = scanner.next();
        DameFigur beute = new DameFigur(xPos1,yPos1,farbe1);
        Bildschirm.loeschen();

        System.out.println("Beute steht. Positionieren Sie den Jaeger.");
        System.out.print("X-Position (A-H) eingeben: ");
        char xPos2 = scanner.next().charAt(0);
        System.out.print("Y-Position (1-8) eingeben: ");
        int yPos2 = scanner.nextInt();
        System.out.print("Farbe eingeben: ");
        String farbe2 = scanner.next();
        DameFigur jaeger = new DameFigur(xPos2,yPos2,farbe2);

        boolean beenden = false;
        if(jaeger.trifft(beute)){
            System.out.println("Der Jaeger hat die Beute getroffen! Jeager gewinnt!");
            beenden = true;
        }else{
            System.out.println();
            System.out.println("Die Beute-Figur steht wo anders!");
            System.out.println("Sie haben jetzt 10 Dame-Zuege, um die Beute-Figur zu treffen. Viel Glueck!");
        }

        int anzahlZuege = 10;
        while(!beenden) {
            if(anzahlZuege == 0) {
                System.out.println();
                System.out.println("Die Beute wurde nicht getroffen. Die Beute gewinnt!");
                break;
            }
            System.out.print("Wollen Sie waagerecht (-), senkrecht (|) oder diagonal (\\,/) ziehen? : ");
            char richtung = scanner.next().charAt(0);
            System.out.print("Wie viele Felder wollen Sie ziehen? :");
            int anzahl = scanner.nextInt();
            jaeger.ziehe(richtung, anzahl);
            System.out.println("Jaeger ist nach " + jaeger.getXpos() + jaeger.getYpos() + " gezogen.");
            if(jaeger.trifft(beute)) {
                System.out.println("Der Jaeger hat die Beute getroffen! Jeager gewinnt!");
                break;
            }else{
                anzahlZuege--;
                System.out.println("Leider kein Treffer! Noch " + anzahlZuege + " Zuege uebrig.");
            }
        }
    }
}
