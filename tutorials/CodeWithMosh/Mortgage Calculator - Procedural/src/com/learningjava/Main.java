package com.learningjava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    // fields
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    // function prototypes
    public static double readNumber(
            int lowerBound,
            int upperBound,
            String paramName) {
        Scanner scanner = new Scanner(System.in);
        double inputValue;
        while(true) {
            System.out.print(paramName + " : ");
            inputValue = Double.parseDouble(scanner.nextLine().trim());
            if (inputValue >= lowerBound && inputValue <= upperBound)
                break;
            System.out.println(paramName + " must be greater than or equal to " + lowerBound + " and less than or equal to " + upperBound + "!");
        }
        return inputValue;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterestRate,
            byte years) {
        float monthlyInterestRate = annualInterestRate / (MONTHS_IN_YEAR * PERCENT);
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double temp = Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double mortgage =  principal * (monthlyInterestRate * temp)/(temp - 1);

        return mortgage;
    }

    public static void printMortgage(
            int principal,
            float annualInterestRate,
            byte years){

        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("MORTGAGE");
        System.out.println("-----------------------------------------------");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage) + "\n");
    }

    public static double calculateLoanBalance(
            int principal,
            float annualInterestRate,
            byte years,
            short numberOfPaymentsMade) {
        float monthlyInterestRate = annualInterestRate / (MONTHS_IN_YEAR * PERCENT);
        short totalNumberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double payment_total = Math.pow(1 + monthlyInterestRate, totalNumberOfPayments);
        double payments_occurred = Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade);
        double loanBalance = principal * (payment_total - payments_occurred)/(payment_total - 1);

        return loanBalance;
    }

    public static void printLoanBalance(
            int principal,
            float annualInterestRate,
            byte years){
        short totalNumberOfPayments = (short)(years * MONTHS_IN_YEAR);

        // calculate and print loan balance
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------------------------------------");
        for (short month = 1; month <= totalNumberOfPayments; month++) {
            // calculate loan balance
            double loanBalance = calculateLoanBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(loanBalance));
        }
    }

    public static void main(String[] args) {
        // print out terminal information's
        System.out.println();
        System.out.println("Hello dear customer! Welcome to the mortgage calculator.");
        System.out.println("Please answer the following questions for your mortgage calculation:");

        // ask for input values: principal, annualInterestRate, years
        int principal = (int) readNumber(1_000,1_000_000,"Principal");
        float annualInterestRate = (float) readNumber(1,30,"Annual Interest Rate");
        byte years = (byte) readNumber(1,100,"Years");

        printMortgage(principal, annualInterestRate, years);
        printLoanBalance(principal, annualInterestRate, years);

    }
}
