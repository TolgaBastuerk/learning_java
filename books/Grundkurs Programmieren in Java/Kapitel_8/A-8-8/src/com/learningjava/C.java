package com.learningjava;

public class C extends A{
    B b = new B(2);
    int someInteger;

    public C(int intC) {
        super(1);
        someInteger = intC;
    }
}
