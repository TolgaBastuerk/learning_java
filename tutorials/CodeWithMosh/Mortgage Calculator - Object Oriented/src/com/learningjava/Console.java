package com.learningjava;

import java.util.Scanner;

/*
 Note:  In console applications, we only have one console.
        Therefore, it makes sense to use the static keyword on the methods because we don't need multiple instances.
 */
public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String paramName) {
        return scanner.nextDouble();
    }
    public static double readNumber(
            int lowerBound,
            int upperBound,
            String paramName) {
        double inputValue;
        while(true) {
            System.out.print(paramName + " : ");
            inputValue = scanner.nextDouble();
            if (inputValue >= lowerBound && inputValue <= upperBound)
                break;
            System.out.println(paramName + " must be greater than or equal to " + lowerBound + " and less than or equal to " + upperBound + "!");
        }
        return inputValue;
    }
}
