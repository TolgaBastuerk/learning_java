package com.learningjava;
import java.util.Scanner;

public class Punkt {
    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void read() {
        var scanner = new Scanner(System.in);
        System.out.print("Geben Sie x ein: ");
        this.x = scanner.nextDouble();
        System.out.print("Geben Sie y ein: ");
        this.y = scanner.nextDouble();
    }
    public String toString() {
        return "(" + Double.toString(x) + "," + Double.toString(y) + ")";
    }
}
