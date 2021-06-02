package com.company;

public class Main {
    /*
    Aufgabe 3.20:
    "Sie wollen ein Schachbrett nummerieren. Formuliere Sie eine geschachtelte
    for-Schleife, die eine entsprechend formatierte Ausgabe erzeugt." [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

    public static void main(String[] args) {
	// write your code here
        int fieldNumber;
        for(int rows = 1; rows <= 8 ; rows++) {
            for( int cols = 1; cols <= 8 ; cols++) {
                fieldNumber = rows+cols-1;
                if( fieldNumber < 10)
                    System.out.print(" " + fieldNumber);
                else
                    System.out.print(fieldNumber);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
