package com.learningjava;

public class Main {
    /*
    Aufgabe 5.3:
    "Bestimmen Sie die Ausgabe des nachfolgenden Java-Programms.
     Wie verändert sich die Ausgabe des Programms, falls in der mit *** gekennzeichneten
     Zeile alle Operatoren && durch & ersetzt werden?" [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));     // true
        return val < 1;                                 // true
    }
    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));     // false
        return val < 2;                                 // false
    }
    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));     // true
        return val < 3;                                 // true
    }
    public static void main(String[] args) {
	// write your code here
        if(test1(0) && test2(2) && test3(2)) // ***
            System.out.println("expression is true");
        else
            System.out.println("expression is false");
    }
}
