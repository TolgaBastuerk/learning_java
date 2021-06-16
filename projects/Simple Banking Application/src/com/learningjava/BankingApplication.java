package com.learningjava;

/**
 * In this project a simple banking application is programmed which
 * contains the following functions:
 * - Check your balance
 * - Make a deposit
 * - Make a withdrawal
 * - View the previous transactions
 * - Calculate interest
 * - exit the application
 *
 * The program utilizes print statements, if/else statements, strings, methods, loops, and more.
 */

public class BankingApplication {

    public static void main(String[] args) {
	    // create new customer
        var person = new Customer("Peter",
                "Miller",
                "Wallstreet 2",
                "01.01.2020");
        // create a bank account for a person
        person.createBankAccount();
        // print bank account information
        System.out.println(person.account);
        // print balance
        System.out.println("Account balance: " + person.account.getBalance());
        // make a deposit
        person.account.makeDeposit(100);
        // print balance
        System.out.println("Account balance: " + person.account.getBalance());
        // make a withdrawal
        person.account.makeWithdrawal(67);
        // print balance
        System.out.println("Account balance: " + person.account.getBalance());
        // print transactions
        System.out.println("Transactions: ");
        person.account.printTransactions();
    }
}
