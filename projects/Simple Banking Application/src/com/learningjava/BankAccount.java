package com.learningjava;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;

public class BankAccount extends Bank {
    private int checkDigit;
    private int bankCode;
    private long accountNumber;
    private String IBAN;
    private double balance;
    private String[] transactions = new String[10];

    public BankAccount() {
        /** following variables are generated randomly :
         * - checkDigit (2-digit number)
         * - bankCode (8-digit number)
         * - accountNumber (10-digit number)
         */
        // random number between 10-99
        checkDigit = (int)(10 + Math.random() * (99 -10));
        // random number between 1000 0000 - 9999 9999
        bankCode = (int)(1000_0000 + Math.random() * (9999_9999 - 1000_0000));
        // random number between 1000 0000 00 - 9999 9999 99
        accountNumber = (long) (1000_0000_00L + Math.random() * (9999_9999_99L - 1000_0000_00L));

        // concatenate IBAN from checkDigit, bankCode and accountNumber
        IBAN = countryCode + Integer.toString(checkDigit) + Integer.toString(bankCode) + Long.toString(accountNumber);

        // upon creation the balance is zero
        balance = 0.0;
    }

    @Override
    public String toString() {
        return  "IBAN : " + countryCode + Integer.toString(checkDigit) + " " +
                // first 4-digits of bankCode
                (int)(bankCode/10_000) + " " +
                // last 4-digits of bankCode
                (int)(bankCode - (int)(bankCode/10_000)*10_000) + " " +
                // first 4-digits of accountNumber
                (int)(accountNumber/1_000_000) + " " +
                // next 4-digits of accountNumber
                (int)(Math.floor((int)(accountNumber - (int)(accountNumber/1_000_000)*1_000_000)/100)) + " " +
                // last 2-digits of accountNumber
                (int)((int)(accountNumber - (int)(accountNumber/1_000_000)*1_000_000) -
                        (int)((int)(accountNumber - (int)(accountNumber/1_000_000)*1_000_000)/100)*100) + "\n" +
                "BIC : " + BIC;
    }

    public void makeDeposit(double cashAmount) {
        balance = balance + cashAmount;
        moveTransactions();
        transactions[0] = "Date: " + new Date() +
                ", Deposit: +" + NumberFormat.getCurrencyInstance().format(cashAmount) +
                ", New Balance: " + NumberFormat.getCurrencyInstance().format(balance);
    }

    public void makeWithdrawal(double cashAmount) {
        if( balance >= cashAmount ) {
            balance = balance - cashAmount;
            moveTransactions();
            transactions[0] = "Date: " + new Date() +
                    ", Withdrawal: -" + NumberFormat.getCurrencyInstance().format(cashAmount) +
                    ", New Balance: " + NumberFormat.getCurrencyInstance().format(balance);
        } else
            System.out.println("Withdrawal denied. Account balance is less than withdrawal amount.");
    }

    private void moveTransactions() {
        for(int i = transactions.length - 1; i > 0; i--) {
            transactions[i] = transactions[i - 1];
        }
    }

    public void printTransactions() {
        for(String transaction : transactions) {
            if( transaction != null)
                System.out.println(transaction);
        }
    }

    /** getter and setter **/
    public double getBalance() {
        return balance;
    }

}
