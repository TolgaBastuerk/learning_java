package com.learningjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter time in seconds : ");
        long input = scanner.nextLong();
        long years, days, hours, minutes, seconds, residual;
        years = Math.floorDiv(input,(60*60*24*365));
        residual = input - years * (60*60*24*365);
        days = Math.floorDiv(residual,(60*60*24));
        residual = residual - days * (60*60*24);
        hours = Math.floorDiv(residual, (60*60));
        residual = residual - hours * (60*60);
        minutes = Math.floorDiv(residual, 60);
        seconds = residual - minutes * 60;

        System.out.println();
        System.out.println(input + " seconds are equal to:");
        System.out.println(years + " years,");
        System.out.println(days + " days,");
        System.out.println(hours + " hours,");
        System.out.println(minutes + " minutes and");
        System.out.println(seconds + " seconds.");



    }
}
