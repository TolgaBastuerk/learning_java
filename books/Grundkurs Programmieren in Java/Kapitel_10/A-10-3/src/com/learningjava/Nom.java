package com.learningjava;

import static com.learningjava.Geschlecht.*;

public class Nom {

    private String name;
    private Geschlecht geschlecht;

    public Nom(Geschlecht geschlecht, String name) {
        this.geschlecht = geschlecht;
        this.name = name;
    }

    public String mitArtikel(Fall fall, boolean bestimmt) {
        if(bestimmt)
            return fall.getBestimmterArtikel(geschlecht) + " " + name;
        else
            return fall.getUnbestimmterArtikel(geschlecht) + " " + name;
    }
}
