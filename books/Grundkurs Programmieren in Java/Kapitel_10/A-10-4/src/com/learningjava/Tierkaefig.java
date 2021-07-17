package com.learningjava;

public class Tierkaefig<E> {
    private E insasse;

    public void setInsasse(E x) {
        insasse = x;
    }
    public E getInsasse() {
        return insasse;
    }
}
