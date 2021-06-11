package com.learningjava;
    /*
    Aufgabe 7.1:
    "Fügen Sie der Klasse Student einen weiteren Konstruktor hinzu. In diesem
    Konstruktor soll man in der Lage sein, alle Instanzvariablen (Name, Nummer, Fach,
    Geburtsjahr) als Argumente zu übergeben. Erhöhen Sie den Zähler hierbei nicht
    selbst, sondern verwenden Sie das Schlüsselwort this, um einen der bereits
    vorhandenen Konstruktoren aufzurufen. Übergeben Sie diesem Konstruktor auch
    das gewünschte Geburtsjahr." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Student {

    private String name;
    private int fach;
    private int nummer;
    private int geburtsjahr;

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
        this.name = name;
        this.nummer = nummer;
        this.fach = fach;
        this.geburtsjahr = geburtsjahr;
    }

    public int getFach() {
        return this.fach;
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
                98765,
                Student.MATHEMATIKSTUDIUM,
                1990);
        System.out.println("Zaehler: " + Student.getZaehler());
        System.out.println("Name: " + student.getName());
        System.out.println("Nummer: " + student.getNummer());
        System.out.println("Geburtsjahr: " + student.getGeburtsjahr());
        System.out.println("Fach: " + student.getFach());
    }
}
