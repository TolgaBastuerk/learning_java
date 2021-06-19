package com.learningjava;

public class Board {

    //String[][] moves = new String[8][8];

    private static final String LETTERS = "   A     B     C     D     E     F     G     H   ";
    private static final String LINES   = "|-----|-----|-----|-----|-----|-----|-----|-----|";

    public static void printBoard(String[][] moves) {
        // print letters at the top of the board
        System.out.println("  " + LETTERS + "  ");

        for(int i = moves.length; i > 0; i--) {
            // print lines between rows
            System.out.println("  " + LINES + " ");
            // print rows with row numbers and tokens
            System.out.print(i + " |");
            for(int j = 0; j < moves.length; j++)
                System.out.print("  " + moves[moves.length - i][j] + "  |");
            System.out.println(" " + i);
        }

        // print last bottom line
        System.out.println("  " + LINES + " ");
        // print letters at the bottom of the board
        System.out.println("  " + LETTERS + "  ");
    }

}
