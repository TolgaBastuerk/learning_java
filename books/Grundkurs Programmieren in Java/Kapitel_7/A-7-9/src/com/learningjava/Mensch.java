package com.learningjava;
    /*
    Aufgabe 7.9:
    "Schreiben Sie eine Klasse Mensch, die private Instanzvariablen beinhaltet, um eine
    laufende Nummer (int), den Vornamen (String), den Nachnamen (String),
    das Alter (int) und das Geschlecht (boolean, mit true für männlich) eines
    Menschen zu speichern. Außerdem soll die Klasse eine private Klassenvariable
    namens gesamtZahl (zur Information über die Anzahl der bereits erzeugten Objekte
    der Klasse) beinhalten, die mit dem Wert 0 zu initialisieren ist.
    Statten Sie die Klasse mit einem Konstruktor aus, der als Parameter das Alter
    als int-Wert, das Geschlecht als boolean-Wert und den Vor- und Nachnamen als
    String-Werte übergeben bekommt und die entsprechenden Instanzvariablen des
    Objekts mit diesen Werten belegt. Außerdem soll der Objektzähler gesamtZahl
    um 1 erhöht und danach die laufende Nummer des Objekts auf den neuen Wert von
    gesamtZahl gesetzt werden.
    Statten Sie die Klasse außerdem mit folgenden Instanzmethoden aus ... " [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Mensch {
    private int nummer;
    private String vorname;
    private String nachname;
    private int alter;
    private boolean geschlecht;

    private static int gesamtzahl = 0;

    public Mensch(int alter, boolean geschlecht, String vorname, String nachname) {
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = ++gesamtzahl;
    }

    /** getter und setter **/
    public int getAlter() {
        return alter;
    }
    public void setAlter(int neuesAlter) {
        this.alter = neuesAlter;
    }
    public boolean getIstMaennlich() {
        return geschlecht;
    }
    /** sonstige Methoden **/
    public boolean aelterAls(Mensch m) {
        return this.alter > m.alter;
    }
    public String toString() {
        String geschlecht = "";
        if (this.getIstMaennlich())
            geschlecht = "maennlich";
        else
            geschlecht = "weiblich";
        return "Vorname, Name: " + vorname + ", " + nachname + "\n" +
                "Alter, Geschlecht: " + alter + ", " + geschlecht + "\n" +
                "Nummer: " + nummer;
    }

}
