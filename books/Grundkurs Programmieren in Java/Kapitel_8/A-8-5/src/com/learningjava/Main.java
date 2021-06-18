package com.learningjava;
    /*
    Aufgabe 8.5:
    "Um auch einfache Datentypen (byte, boolean, int, double,. . . ) als Objekte
    behandeln zu können, stellt Java sogenannte Wrapper-Klassen (deutsch: Hüll-
    Klassen) zur Verfügung, d. h. Klassen, die den entsprechenden Datentyp in ein
    Objekt „einpacken“. Wir werden uns mit diesen Klassen in Abschnitt 11.2 noch
    im Detail beschäftigen. Diese Klassen schreiben sich genau wie der entsprechende
    elementare Datentyp (mit der Ausnahme, dass der erste Buchstabe groß geschrie-
    ben wird).
    Nehmen wir einmal an, wir besitzen ein solches Double-Objekt. Wie finden wir
    heraus, ob die im Objekt gespeicherte Zahl den Wert 0 hat?" [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Double d1 = new Double(3.14);
        Double d2 = new Double(0.0);

        // erste Variante
        if(d1.doubleValue() == 0.0)
            System.out.println("d1 hat den Wert 0.0.");
        else
            System.out.println("d1 hat nicht den Wert 0.0");

        // zweite Variante
        if(d1.doubleValue() == d2.doubleValue())
            System.out.println("d1 hat den Wert 0.0.");
        else
            System.out.println("d1 hat nicht den Wert 0.0");

        // dritte Variante
        if( d1.equals(new Double(0.0)))
            System.out.println("d1 hat den Wert 0.0.");
        else
            System.out.println("d1 hat nicht den Wert 0.0");

        // vierte Variante
        if( d1.doubleValue() < 1e-20)
            System.out.println("d1 hat den Wert 0.0.");
        else
            System.out.println("d1 hat nicht den Wert 0.0");
    }
}
