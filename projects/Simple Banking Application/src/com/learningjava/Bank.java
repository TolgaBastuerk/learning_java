package com.learningjava;

// some german banking company
public class Bank {
    public static final String countryCode = "DE";
    public static final String BIC = "ABCDEF";
    private static int numberOfCustomers = 0;

    /** getter and setter methods **/
    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public static void incrementNumberOfCustomers() {
        numberOfCustomers ++;
    }
}
