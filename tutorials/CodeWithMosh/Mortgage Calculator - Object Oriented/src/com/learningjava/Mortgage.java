package com.learningjava;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private int principal;
    private float annualInterestRate;
    private byte years;

    // custom constructors
    public Mortgage(int principal, float annualInterestRate, byte years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }
    public Mortgage() {
        this(0,0F,(byte)0);
    }

    public void setupRoutine() {
        System.out.println();
        System.out.println("Hello dear customer! Welcome to the mortgage calculator.");
        System.out.println("Please answer the following questions for your mortgage calculation:");

        // set principal, annualInterestRate and years
        setPrincipal((int) readNumber(1000,1_000_000,"Principal"));
        setAnnualInterestRate((float) readNumber(1,30,"Annual Interest Rate"));
        setYears((byte) readNumber(1,100,"Years"));
    }

    private double readNumber(
            int lowerBound,
            int upperBound,
            String paramName
    ) {
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

    private double calculateMortgage() {
        float monthlyInterestRate = annualInterestRate / (MONTHS_IN_YEAR * PERCENT);
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double temp = Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double mortgage =  principal * (monthlyInterestRate * temp)/(temp - 1);

        return mortgage;
    }

    private double calculateLoanBalance(short numberOfPaymentsMade) {
        float monthlyInterestRate = annualInterestRate / (MONTHS_IN_YEAR * PERCENT);
        short totalNumberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double payment_total = Math.pow(1 + monthlyInterestRate, totalNumberOfPayments);
        double payments_occurred = Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade);
        double loanBalance = principal * (payment_total - payments_occurred)/(payment_total - 1);

        return loanBalance;
    }

    public void printMortgage() {
        double mortgage = calculateMortgage();
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("MORTGAGE");
        System.out.println("-----------------------------------------------");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage) + "\n");
    }

    public void printLoanBalance() {
        short totalNumberOfPayments = (short)(years * MONTHS_IN_YEAR);

        // calculate and print loan balance
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------------------------------------");
        for (short month = 1; month <= totalNumberOfPayments; month++) {
            // calculate loan balance
            double loanBalance = calculateLoanBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(loanBalance));
        }
    }

    // getter and setter methods
    private void setAnnualInterestRate(float annualInterestRate) {
        if (annualInterestRate < 1 || annualInterestRate > 30)
            throw new IllegalArgumentException("Annual Interest Rate must be greater than or equal to 1 and less than or equal to 30.");
        this.annualInterestRate = annualInterestRate;
    }
    private float getAnnualInterestRate() {
        return annualInterestRate;
    }
    private void setPrincipal(int principal) {
        if (principal < 1000 || principal > 1_000_000)
            throw new IllegalArgumentException("Principal must be greater than or equal to 1,000 and less than or equal to 1,000,000.");
        this.principal = principal;
    }
    private int getPrincipal() {
        return principal;
    }
    private void setYears(byte years) {
        if (years < 1 || years > 100)
            throw new IllegalArgumentException("Years must be greater than or equal to 1 and less than or equal to 100.");
        this.years = years;
    }
    private byte getYears() {
        return years;
    }
}
