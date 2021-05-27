package com.learningjava;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello dear customer! Welcome to the mortgage calculator.");
        System.out.println("Please answer the following questions for your mortgage calculation:");

        int principal = (int) Console.readNumber(1_000,1_000_000,"Principal");
        float annualInterestRate = (float) Console.readNumber(1,30,"Annual Interest Rate");
        byte years = (byte) Console.readNumber(1,100,"Years");

        var calculator = new MortgageCalculator(principal, annualInterestRate, years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}
