package com.learningjava;
    /*
    Aufgabe 7.2:
    "Fügen Sie der Klasse Studenteine weitere private Instanzvariable geschlecht
    sowie ﬁnale Klassenvariablen WEIBLICHund MAENNLICHhinzu, sodass beim Arbeiten
    mit Objekten der Klasse Studentexplizit zwischen weiblichen und männlichen
    Studierenden unterschieden werden kann. Fügen Sie der Klasse Student weitere
    Konstruktoren hinzu, die diese neuen Variablen berücksichtigen. Verwenden Sie
    auch hier mit Hilfe des Schlüsselworts this bereits vorhandene Konstruktoren" [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Student {

    private String name;
    private int fach;
    private int nummer;
    private int geburtsjahr;
    private int geschlecht;

    public static int zaehler = 0;

    /** Konstanten **/
    public static final int MATHEMATIKSTUDIUM = 1;
    public static final int INFORMATIKSTUDIUM = 2;
    public static final int ARCHITEKTURSTUDIUM = 3;
    public static final int WIRTSCHAFTLICHESSTUDIUM = 4;
    public static final int BIOLOGIESTUDIUM = 5;
    public static final int GESCHICHTSSTUDIUM = 6;
    public static final int GERMANISTIKSTUDIUM = 7;
    public static final int POLITOLOGIESTUDIUM = 8;
    public static final int PHYSIKSTUDIUM = 9;

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
    public Student(String name, int nummer, int fach, int geburtsjahr) {
        this(geburtsjahr);
        setName(name);
        setNummer(nummer);
        setFach(fach);
    }
    public Student(String name, int geschlecht, int nummer, int fach, int geburtsjahr) {
        this(name, nummer, fach, geburtsjahr);
        setGeschlecht(geschlecht);
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
    public int getFach() {
        return this.fach;
    }
    public void setFach(int fach) {
        switch (fach) {
            case MATHEMATIKSTUDIUM -> this.fach = MATHEMATIKSTUDIUM;
            case INFORMATIKSTUDIUM -> this.fach = INFORMATIKSTUDIUM;
            case ARCHITEKTURSTUDIUM -> this.fach = ARCHITEKTURSTUDIUM;
            case WIRTSCHAFTLICHESSTUDIUM -> this.fach = WIRTSCHAFTLICHESSTUDIUM;
            case BIOLOGIESTUDIUM -> this.fach = BIOLOGIESTUDIUM;
            case GESCHICHTSSTUDIUM -> this.fach = GESCHICHTSSTUDIUM;
            case GERMANISTIKSTUDIUM -> this.fach = GERMANISTIKSTUDIUM;
            case POLITOLOGIESTUDIUM -> this.fach = POLITOLOGIESTUDIUM;
            case PHYSIKSTUDIUM -> this.fach = PHYSIKSTUDIUM;
            default -> System.out.println("Fehlerhafte Eingabe!");
        }
    }
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

    public static void main(String[] args) {
        // write your code here
        var student = new Student("Peter",
                Student.MAENNLICH,
                98765,
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