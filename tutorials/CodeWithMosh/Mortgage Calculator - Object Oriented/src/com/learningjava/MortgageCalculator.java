package com.learningjava;

import java.text.NumberFormat;

public class MortgageCalculator {

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterestRate;
    private byte years;

    public MortgageCalculator(int principal, float annualInterestRate, byte years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        short numberOfPayments = getNumberOfPayments();

        double temp = Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double mortgage =  principal * (monthlyInterestRate * temp)/(temp - 1);

        return mortgage;
    }

    public double calculateLoanBalance(short numberOfPaymentsMade) {
        float monthlyInterestRate = getMonthlyInterestRate();
        short totalNumberOfPayments = getNumberOfPayments();

        double payment_total = Math.pow(1 + monthlyInterestRate, totalNumberOfPayments);
        double payments_occurred = Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade);
        double loanBalance = principal * (payment_total - payments_occurred)/(payment_total - 1);

        return loanBalance;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateLoanBalance(month);

        return balances;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / (MONTHS_IN_YEAR * PERCENT);
    }
}
