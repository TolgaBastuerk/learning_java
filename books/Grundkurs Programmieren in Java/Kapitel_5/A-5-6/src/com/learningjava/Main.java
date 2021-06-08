package com.learningjava;

public class Main {
    /*
    Aufgabe X.X:
    "Das folgende Programm enthält mehrere Methoden namens hoppla.
    Überlegen Sie, welche der 8 Methodenaufrufe unzulässig sind. Geben Sie bei
    zulässigen Aufrufen an, was auf dem Bildschirm ausgegeben wird." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void hoppla(long x, double y, double z) {
        System.out.println("ldd");
    }
    public static void hoppla(long x, long y, double z) {
        System.out.println("lld");
    }
    public static void hoppla(long x, long y, long z) {
        System.out.println("lll");
    }
    public static void hoppla(double x, long y, double z) {
        System.out.println("dld");
    }
    public static void main(String[] args) {
	// write your code here
        long a = 333;
        double b = 4.44;
        hoppla(a,a,a); // Aufruf 1  : lll
    //    hoppla(b,b,b); // Aufruf 2  : unzulaessig
        hoppla(a,a,b); // Aufruf 3  : lld
    //    hoppla(b,b,a); // Aufruf 4  : unzulaessig
        hoppla(a,b,a); // Aufruf 5  : lll (implizite Typkonvertierung von long zu double)
        hoppla(a,b,b); // Aufruf 6  : ldd
        hoppla(b,a,b); // Aufruf 7  : dld
        hoppla(b,a,a); // Aufruf 8  : dld (implizite Typkonvertierung von long zu double)
    }
}
