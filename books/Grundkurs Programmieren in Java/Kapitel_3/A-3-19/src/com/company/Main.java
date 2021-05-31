package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = scanner.nextInt();
        int i;

        // variant 1: for-loop
        System.out.println();
        System.out.println("Variant 1 : for-loop");
        System.out.println("-------------------------");
        for(i = 4; i-1 < 2*n ; i++)
            System.out.println(1.0/(2*i+1));

        // variant 2: while-loop
        System.out.println();
        System.out.println("Variant 1 : while-loop");
        System.out.println("-------------------------");
        i = 3;
        while(i < 2*n){
            i++;
            System.out.println(1.0/(2*i+1));
        }

        // variant 3: do-while loop
        System.out.println();
        System.out.println("Variant 1 : do-while loop");
        System.out.println("-------------------------");
        i = 3;
        do {
            i++;
            System.out.println(1.0/(2*i+1));
        } while( i < 2*n);
    }
}
