package com.learningjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x = 1.0, y = 2.5;
        System.out.println(x / y);                          // 0.4
        System.out.println("x / y = " + x / y);             // x / y = 0.4
        System.out.println(x + y);                          // 3.5
        System.out.println("x + y = " + x + y);             // x + y = 1.02.5
        System.out.println(x - y);                          // -1.5
        System.out.println("x - y = " + (x - y));           // x - y = -1.5
        System.out.println(1 + 2 + 3 + 4);                  // 10
        System.out.println(1 + 2 + 3 + "4");                // 64
        System.out.println("1" + 2 + 3 + 4);                // 1234
        System.out.println("Hilfe" + true + 3);             // Hilfetrue3
        System.out.println(true + (3 + "Hilfe"));           // true3Hilfe
    }
}
