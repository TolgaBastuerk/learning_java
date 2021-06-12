package com.learningjava;

public class Musik {
    public static void main(String[] args) {
        Klang k = new Klang(1, 5);
        Krach r = new Krach(4, 17, 30);
        System.out.println(r);
        r.mehrPower(3);
        r.mehrPower(2, 2);
    }
}
