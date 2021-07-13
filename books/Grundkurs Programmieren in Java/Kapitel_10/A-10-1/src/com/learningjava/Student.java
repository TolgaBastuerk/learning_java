package com.learningjava;
import com.studienfaecher.Fach;

    /*
    Aufgabe 10.1 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Student {

    private String name;
    private Fach fach;
    private int nummer;
    private int geburtsjahr;
    private int geschlecht;

    public static int zaehler = 0;

    public static final int MAENNLICH = 0;
    public static final int WEIBLICH = 1;

    public static final Student PHANTOM;

    /** Statische Initialisierung **/
    static {
        PHANTOM = new Student(1735);
        PHANTOM.name = "Erik le Phant";
        PHANTOM.nummer = -12345;
        zaehler = 0;
    }

    /** Konstruktoren **/
    public Student() {
        this(2000);
    }
    public Student(int geburtsjahr) {
        zaehler++;
        setGeburtsjahr(geburtsjahr);
    }
    public Student(String name, int nummer, Fach fach, int geburtsjahr) {
        this(geburtsjahr);
        setName(name);
        setNummer(nummer);
        setFach(fach);
    }
    public Student(String name, int geschlecht, int nummer, Fach fach, int geburtsjahr) {
        this(name, nummer, fach, geburtsjahr);
        setGeschlecht(geschlecht);
    }

    /** sonstige Methoden **/
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Matrikelnummer: " + this.nummer + "\n" +
                "Fach: " + this.fach.toString().toLowerCase();
    }

    /** getter und setter Methoden **/
    public int getGeschlecht() {
        return this.geschlecht;
    }
    public void setGeschlecht(int geschlecht) {
        switch (geschlecht) {
            case MAENNLICH -> this.geschlecht = MAENNLICH;
            case WEIBLICH -> this.geschlecht = WEIBLICH;
            default -> System.out.println("Fehlerhafte Eingabe!");
        }
    }
    public Fach getFach() {
        return this.fach;
    }
    public void setFach(Fach fach) { this.fach = fach; }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }
    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }
    public static int getZaehler() {
        return zaehler;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNummer() {
        return nummer;
    }
    public void setNummer(int nummer) {
        if((nummer >= 10_000) && (nummer <= 99999) && (nummer % 2 != 0))
            this.nummer = nummer;
    }
}