package com.learningjava;

public class Calculator {
    private int number;

    public void calculateChecksum() {
        int sum = 0;
        int factor = 0;
        int residual = number;
        System.out.print("Die Quersumme ergibt sich zu : ");
        for(int i = 3; i >= 0; i--) {
            factor = (int) (residual / (Math.pow(10,i)));
            sum += factor;
            residual = residual - (int) (factor  * (Math.pow(10,i)));
            System.out.print(factor);
            if (i > 0)
                System.out.print(" + ");
        }
        System.out.print(" = " + sum);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number <= 0 || number >= 10_000)
            throw new IllegalArgumentException("Number must be greater than 0 and less than 10000");
        else
            this.number = number;
    }
}
