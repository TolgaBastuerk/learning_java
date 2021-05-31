package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int fieldNumber;
        for(int rows = 1; rows <= 8 ; rows++) {
            for( int cols = 1; cols <= 8 ; cols++) {
                fieldNumber = rows+cols-1;
                if( fieldNumber < 10)
                    System.out.print(" " + fieldNumber);
                else
                    System.out.print(fieldNumber);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
