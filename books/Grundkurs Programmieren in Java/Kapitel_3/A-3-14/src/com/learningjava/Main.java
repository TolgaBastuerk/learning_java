package com.learningjava;

public class Main {
    /*
    Aufgabe 3.14:
    "Stellen Sie sich vor, Sie machen gerade Urlaubsvertretung für einen Verpackungs-
    ingenieur bei der Firma Raviolita. Dieser hat Ihnen kurz vor seiner Abreise in den
    Spontanurlaub noch das Programm hinterlassen.

    Dieses Programm führt Berechnungen durch, die bei der Herstellung von Konser-
    vendosen aus einem Blechstück mit
        Länge u (Umfang der Dose in Zentimetern) und
        Breite h (Höhe der Dose in Zentimetern)
    anfallen. Dieses Programm sollen Sie nun so vervollständigen, dass es ausge-
    hend von den Variablen u und h und unter Verwendung der Konstanten π (bzw.
    PI = 3.141592) die folgenden Werte berechnet und ausgibt:
        den Durchmesser des Dosenbodens,
        die Fläche des Dosenbodens,
        die Mantelﬂäche der Dose,
        die Gesamtﬂäche der Dose,
        das Volumen der Dose" [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here

        var dose = new Dose(40,15);
        dose.informationen();


    }
}
