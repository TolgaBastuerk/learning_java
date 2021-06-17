package com.learningjava;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * This project contains a simple banking application with the following functionality:
 * - Create a new customer profile
 * - Select a customer
 * - Create a new bank account for selected customer
 * - Check customers bank account balance
 * - Make a deposit for a customer
 * - Make a withdrawal for a customer
 * - Print last 10 transactions of a customer
 * - Exit banking application
 * The program utilizes print statements, if/else statements, strings, methods, loops, and more.
 */

public class BankingApplication {


    public static void main(String[] args) {
        boolean exit = false;
        var scanner = new Scanner(System.in);
        int navigation;                            // navigation feedback
        String feedbackStr;                        // feedback for string requests
        int feedbackInt;                           // feedback for integer requests
        double feedbackDouble;                     // feedback for double requests
        Customer[] customers = new Customer[10];    // array of customers
        Customer customer = null;

        System.out.println("Welcome to the simple banking application...");

        while (!exit) {
            // feedback from user
            navigation = printNavigation();
            // system options
            switch (navigation) {
                // Create a new customer profile
                case 1:
                    // find the first empty element of "customers" array and create a new customer
                    for (int i = 0; i < customers.length; i++) {
                        if (customers[i] == null) {
                            scanner.reset();
                            System.out.println("Please enter customer information's.");
                            System.out.print("First name: ");
                            String firstName = scanner.nextLine();
                            System.out.print("Last name: ");
                            String lastName = scanner.nextLine();
                            System.out.print("Birthday: ");
                            String birthday = scanner.nextLine();
                            System.out.print("Address: ");
                            String address = scanner.nextLine();
                            customers[i] = new Customer(firstName, lastName, address, birthday);
                            System.out.println("New customer profile has been created successfully!");
                            break; // break for-loop
                        }
                    }
                    break;
                    // Select a customer
                case 2:
                    // print out created customers and select one
                    boolean notEmpty = false;
                    for (int i = 0; i < customers.length; i++) {
                        if (customers[i] != null) {
                            notEmpty = true;
                            System.out.println(i + " - " +
                                    customers[i].getFirstName() + " " + customers[i].getLastName());
                        }
                    }
                    if (notEmpty) {
                        scanner.reset();
                        System.out.print("Please select a customer: ");
                        feedbackInt = scanner.nextInt();
                        customer = customers[feedbackInt];
                        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName() +
                                " has been selected.");
                    } else
                        System.out.println("No customers found. Please create a new customer first.");
                    break;
                // Create a new bank account for selected customer
                case 3:
                    if(customer != null) {
                        if(!customer.getHasBankAccount()){
                            scanner.reset();
                            System.out.print("Do you wish to create a new bank account for customer " +
                                    customer.getFirstName() + " " + customer.getLastName() + " (Y/N)? : ");
                            feedbackStr = scanner.next();
                            if (feedbackStr.equals("Y")) {
                                customer.createBankAccount();
                                System.out.println("Bank account created successfully. Information's : ");
                                System.out.println(customer.account);
                            }
                        }else
                            System.out.println("Customer " + customer.getFirstName() + " " + customer.getLastName() +
                                    " has already a registered bank account.");
                    }else
                        System.out.println("No customer selected. Please select a customer first.");
                    break;
                // Check customers bank account balance
                case 4:
                    if(customer != null) {
                        if(customer.getHasBankAccount()) {
                            scanner.reset();
                            System.out.print("Do you wish to check the bank account balance for customer " +
                                    customer.getFirstName() + " " + customer.getLastName() + " (Y/N)? : ");
                            feedbackStr = scanner.next();
                            if (feedbackStr.equals("Y")) {
                                System.out.println("Account balance: " +
                                        NumberFormat.getCurrencyInstance().format(customer.account.getBalance()));
                            }
                        }else
                            System.out.println("Selected customer doesn't have a bank account. " +
                                    "Please create a bank account first.");
                    }else
                        System.out.println("No customer selected. Please select a customer first.");
                    break;
                // Make a deposit for a customer
                case 5:
                    if(customer != null) {
                        if(customer.getHasBankAccount()) {
                            scanner.reset();
                            System.out.print("Do you wish to make a deposit for customer " +
                                    customer.getFirstName() + " " + customer.getLastName() + " (Y/N)? : ");
                            feedbackStr = scanner.next();
                            if (feedbackStr.equals("Y")) {
                                System.out.print("Please enter deposit amount: ");
                                feedbackDouble = scanner.nextDouble();
                                customer.account.makeDeposit(feedbackDouble);
                            }
                        }else
                            System.out.println("Selected customer doesn't have a bank account. " +
                                    "Please create a bank account first.");
                    }else
                        System.out.println("No customer selected. Please select a customer first.");
                    break;
                // Make a withdrawal for a customer
                case 6:
                    if(customer != null) {
                        if(customer.getHasBankAccount()) {
                            scanner.reset();
                            System.out.print("Do you wish to make a withdrawal for customer " +
                                    customer.getFirstName() + " " + customer.getLastName() + " (Y/N)? : ");
                            feedbackStr = scanner.next();
                            if (feedbackStr.equals("Y")) {
                                System.out.print("Please enter withdrawal amount: ");
                                feedbackDouble = scanner.nextDouble();
                                customer.account.makeWithdrawal(feedbackDouble);
                            }else
                                System.out.println("Selected customer doesn't have a bank account. " +
                                        "Please create a bank account first.");
                        }
                    }else
                        System.out.println("No customer selected. Please select a customer first.");
                    break;
                // View previous transactions of a customer
                case 7:
                    if(customer != null) {
                        if(customer.getHasBankAccount()) {
                            scanner.reset();
                            System.out.print("Do you wish to print the last 10 transactions for customer " +
                                    customer.getFirstName() + " " + customer.getLastName() + " (Y/N)? : ");
                            feedbackStr = scanner.next();
                            if (feedbackStr.equals("Y")) {
                                customer.account.printTransactions();
                            }
                        }else
                            System.out.println("Selected customer doesn't have a bank account. " +
                                    "Please create a bank account first.");
                    }else
                        System.out.println("No customer selected. Please select a customer first.");
                    break;
                // Exit banking application
                case 8:
                    System.out.print("Do you wish to exit the banking application (Y/N)? :");
                    feedbackStr = scanner.next();
                    if (feedbackStr.equals("Y")) {
                        System.out.println("Thank you for using the simple banking application system! Good bye!");
                        exit = true;
                    }
                    break;
                // Incorrect input
                default:
                    System.out.println("Incorrect input. Please try again later.");
            }
        }
    }

    private static int printNavigation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please select one of the following options to navigate through the system:" + "\n" +
                "1 - Create a new customer profile" + "\n" +
                "2 - Select a customer" + "\n" +
                "3 - Create a new bank account for selected customer" + "\n" +
                "4 - Check customers bank account balance" + "\n" +
                "5 - Make a deposit for a customer" + "\n" +
                "6 - Make a withdrawal for a customer" + "\n" +
                "7 - Print last 10 transactions of a customer" + "\n" +
                "8 - Exit banking application");
        System.out.print("Please select an option (1-8): ");
        int feedback = scanner.nextInt();
        System.out.println();
        return feedback;
    }

}
