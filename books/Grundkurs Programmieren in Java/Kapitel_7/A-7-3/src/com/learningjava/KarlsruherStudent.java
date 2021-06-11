package com.learningjava;
    /*
    Aufgabe 7.3:
    "Wir nehmen an, dass alle Karlsruher Hochschulen über ein besonderes System
    verfügen, um Matrikelnummern auf Korrektheit zu überprüfen:
    - Zuerst wird die (als siebenstellig festgelegte) Zahl in ihre Ziffern aufgeteilt,
      Z1, Z2, Z3, Z4, Z5, Z6, Z7,
    - Nun wird eine spezielle "gewichtete Quersumme" gebildet,
      Quersumme = 2*Z1 + 1*Z2 + 4*Z3 + 3*Z4 + 2*Z5 + 1*Z6,
    - Die Matrikelnummer ist genau dann gültig, wenn die letzte Ziffer der Matrikelnummer
      (also Z7) mit der letzten Ziffer der Quersumme übereinstimmt.

    Sie sollen nun eine spezielle Klasse KarlsruherStudententwickeln, die lediglich
    Zahlen als Matrikelnummern zulässt, die diese Prüfung bestehen." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class KarlsruherStudent extends Student {

    public KarlsruherStudent(String name, int geschlecht, int nummer, int fach, int geburtsjahr) {
        super(geburtsjahr);
        this.setName(name);
        this.setGeschlecht(geschlecht);
        this.setFach(fach);
        this.setNummer(nummer);
    }

    @Override
    public boolean validateNummer(int nummer) {
        int[] ziffern = new int[7];
        for(int i = ziffern.length - 1 ; i >= 0 ; i--) {
            ziffern[i] = nummer % 10;
            nummer = nummer / 10;
        }
        int[] gewichtungen = {2, 1, 4, 3, 2, 1};
        int quersumme = 0;
        for(int i = ziffern.length - 2 ; i >= 0; i--) {
            quersumme = quersumme + gewichtungen[i]*ziffern[i];
        }
        return quersumme % 10 == ziffern[ziffern.length - 1];
    }

    public static void main(String[] args) {
	// write your code here
        var student = new KarlsruherStudent("Peter",
                Student.MAENNLICH,
                1234564,
                Student.MATHEMATIKSTUDIUM,
                1990);
        System.out.println("Zaehler: " + Student.getZaehler());
        System.out.println("Name: " + student.getName());
        System.out.println("Geschlecht: " + student.getGeschlecht());
        System.out.println("Nummer: " + student.getNummer());
        System.out.println("Geburtsjahr: " + student.getGeburtsjahr());
        System.out.println("Fach: " + student.getFach());
    }
}
