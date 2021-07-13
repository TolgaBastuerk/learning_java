package com.learningjava;
import static com.studienfaecher.Fach.*;

    /*
    Aufgabe 10.2 aus [1]

    Quelle:
    [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
     */

public class StudentenTest {

    public static void main(String[] args) {
	// write your code here
        Student Peter = new Student();
        Peter.setName("Peter Honig");
        Peter.setNummer(12345);
        Peter.setFach(MATHEMATIKSTUDIUM);
        System.out.println(Peter);
        System.out.println();
        System.out.println("Regelstudienzeit fuer sein Studium: " +
                Peter.getFach().regelstudienzeit() + " Semester.");
    }
}
