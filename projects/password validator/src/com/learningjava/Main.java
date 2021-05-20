package com.learningjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        askForHelp();

        do {
            System.out.println();
            System.out.print("Please enter your password for validation: ");
            String password = scanner.next().trim();
            isValid = checkPassword(password);
        } while (!isValid);

    }

    public static boolean checkPassword(String password){
        String[] alphabetLower = {"a","b","c","d","e","f","g","h", "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] alphabetUpper = {"A","B","C","D","E","F","G","H", "I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] symbols = {"$","%","&","#","*","@","_"};
        boolean isValid = false;
        boolean checkLength = false;
        boolean checkLowerCase = false;
        boolean checkUpperCase = false;
        boolean checkDigit = false;
        boolean checkSymbol = false;

        // check if password is long enough
        if (password.length() < 8 || password.length() > 20)
            System.out.println("Your password must contain at least 8 and at most 20 characters.");
        else
            checkLength = true;

        // check if password contains a lower case letter
        for (int i = 0; i < alphabetLower.length; i++) {
            checkLowerCase = password.contains(alphabetLower[i]);
            if (checkLowerCase)
                break;
            if(i == alphabetLower.length-1)
                System.out.println("Your password must contain at least one lower case letter (a-z).");
        }

        // check if password contains a upper case letter
        for (int i = 0; i < alphabetUpper.length; i++) {
            checkUpperCase = password.contains(alphabetUpper[i]);
            if (checkUpperCase)
                break;
            if(i == alphabetUpper.length-1)
                System.out.println("Your password must contain at least one upper case letter (A-Z).");
        }

        // check if password contains a digit
        for (int i = 0; i < digits.length; i++) {
            checkDigit = password.contains(digits[i]);
            if (checkDigit)
                break;
            if(i == digits.length-1)
                System.out.println("Your password must contain at least one digit (0-9).");
        }

        // check if password contains a symbol
        for (int i = 0; i < symbols.length; i++) {
            checkSymbol = password.contains(symbols[i]);
            if (checkSymbol)
                break;
            if(i == symbols.length-1)
                System.out.println("Your password must contain at least one symbol ($,%,&,#,*,@,_).");
        }

        if (checkLength && checkLowerCase && checkUpperCase && checkDigit && checkSymbol) {
            System.out.println("Your password validation was successful! Congratulations, you have created a strong password.");
            isValid = true;
        }

        return isValid;
    }

    public static void askForHelp(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the password validator. \nDo you want read the password specifications? (y/n) : ");
        String answer = scanner.next().trim();
        if (answer.equals("y"))
            printSpecification();
    }

    public static void printSpecification(){
        System.out.println();
        System.out.println("Please create a password which fulfills the following criteria:");
        System.out.println("1. Password must contain at least 8 and at most 20 characters.");
        System.out.println("2. Password must contain at least one upper case letter (A-Z)");
        System.out.println("3. Password must contain at least one lower case letter (a-z)");
        System.out.println("4. Password must contain at least one digit (0-9)");
        System.out.println("5. Password must contain at least one symbol ($,%,&,#,*,@,_)");
        System.out.println();
    }
}
