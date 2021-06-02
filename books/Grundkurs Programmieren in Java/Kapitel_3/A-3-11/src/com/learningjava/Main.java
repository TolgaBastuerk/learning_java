package com.learningjava;

public class Main {
    /*
    Aufgabe 3.11:
    "Vollziehen Sie das Programm nach, und überlegen Sie sich, welche Werte ausge-
    geben werden." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println("a = 1, b = 2, c = 3, d = 4");
        System.out.println("--------------------------");
        System.out.println("++a = " + ++a);                         // 2
        System.out.println("a = " + a);                             // 2
        System.out.println("b++ = " + b++);                         // 2
        System.out.println("b = " + b);                             // 3
        System.out.println("(++c) + (++c) = " + ((++c) + (++c)));   // 4 + 5 = 9
        System.out.println("c = " + c);                             // 5
        System.out.println("(d++) + (d++) = " + ((d++) + (d++)));   // 4 + 5 = 9
        System.out.println("d = " + d);                             // 6
    }
}
