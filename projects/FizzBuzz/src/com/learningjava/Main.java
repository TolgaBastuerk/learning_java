package com.learningjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* this program gets an input number and then prints an output depending on the following cases:
        - number is divisible by 5 : print "Fizz"
        - number is divisible by 3 : print "Buzz"
        - number is divisible by 5 and 3 : print "FizzBuzz"
        - number of not divisible by 5 or 3 : print the number
	 */
        System.out.print("Please enter a integer: ");
        Scanner scanner = new Scanner(System.in);
        int aNumber = scanner.nextInt();
        if ( aNumber % 5 == 0 && aNumber % 3 == 0)
            System.out.println("FizzBuzz");
        else if ( aNumber % 5 == 0 )
            System.out.printf("Fizz");
        else if ( aNumber % 3 == 0 )
            System.out.println("Buzz");
        else
            System.out.println(aNumber);
    }
}
