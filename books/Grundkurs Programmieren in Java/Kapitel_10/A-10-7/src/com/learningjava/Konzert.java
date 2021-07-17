package com.learningjava;

    /**
        Aufgabe 10.7 aus [1]

        Quelle:
        [1] Dietmar Ratz, Dennis Schulmeister-Zimolong, Detlef Seese, Jan Wiesenberger,
        Grundkurs Programmieren in Java, 8. Auflage, 2018, Hanser Verlag
    */

public class Konzert {

    private Roadie<? extends Zuschauer> vorderEingang;
    private Roadie<? super Star> hinterEingang;
    private Roadie<? extends Groupie> backstage;

    public Konzert(Roadie<? extends Zuschauer> vorderEingang,
                   Roadie<? super Star> hinterEingang,
                   Roadie<? extends Groupie> backstage) {
        this.vorderEingang = vorderEingang;
        this.hinterEingang = hinterEingang;
        this.backstage = backstage;
    }

    public static void main(String[] args) {
	// write your code here
        final Roadie<Zuschauer> roadie1 = new Roadie<Zuschauer>();
        final Roadie<Performer> roadie2 = new Roadie<Performer>();
        final Roadie<HuebschesGroupie> roadie3 = new Roadie<HuebschesGroupie>();
        final Roadie<Groupie> roadie4 = new Roadie<Groupie>();
        final Roadie<Star> roadie5 = new Roadie<Star>();
        final Roadie<Person> roadie6 = new Roadie<Person>();
        final Roadie roadie7 = new Roadie();

        Konzert konzert1 = new Konzert(roadie1,roadie2,roadie3);
        // Konzert konzert2 = new Konzert(roadie2,roadie2,roadie3);
        Konzert konzert3 = new Konzert(roadie1,roadie5,roadie4);
        Konzert konzert4 = new Konzert(roadie1,roadie5,roadie4);
        Konzert konzert5 = new Konzert(roadie4,roadie5,roadie4);
        // Konzert konzert6 = new Konzert(roadie6,roadie2,roadie3);
        Konzert besondersExklusiv = new Konzert(roadie3,roadie5,roadie3);
        Konzert besondersLax = new Konzert(roadie7,roadie7,roadie7);


    }
}
