package com.learningjava;

public class Roadie<T extends Person> {
    public void gewaehreEinlass(T person) {
        System.out.println("Willkommen, " + person);
    }
}
