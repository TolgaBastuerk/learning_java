package com.learningjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int matrNr = 12345678;
        Komponente p,q;
        int i;
        p = new Komponente();
        p.ref = null;
        p.wert = matrNr % 10;      // 8
        matrNr = matrNr / 10;      // 1234567
        for(i = 2; i <= 3; i++) {
            q = new Komponente();
            q.ref = p;
            p = q;
            p.wert = matrNr % 10;   // 7 , 6
            matrNr = matrNr / 10;   // 123456 , 12345
        }
        for(i = 1; i <= 3; i++) {
            System.out.print(p.wert); // 678
            p = p.ref;
        }
    }
}
