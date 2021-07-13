package com.studienfaecher;

    /*
    Aufgabe 10.2 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public enum Fach {
    ARCHITEKTURSTUDIUM, BIOLOGIESTUDIUM, GERMANISTIKSTUDIUM,
    GESCHICHTSSTUDIUM, INFORMATIKSTUDIUM, MATHEMATIKSTUDIUM,
    PHYSIKSTUDIUM, POLITOLOGIESTUDIUM, WIRTSCHAFTLICHESSTUDIUM;

    public int regelstudienzeit() {
        switch(this) {
            case ARCHITEKTURSTUDIUM:
            case BIOLOGIESTUDIUM :
            case GERMANISTIKSTUDIUM:
            case GESCHICHTSSTUDIUM:
                return 5;
            case INFORMATIKSTUDIUM:
            case MATHEMATIKSTUDIUM:
            case PHYSIKSTUDIUM:
                return 7;
            case POLITOLOGIESTUDIUM:
            case WIRTSCHAFTLICHESSTUDIUM:
                return 6;
            default:
                return 0;
        }
    }

}

