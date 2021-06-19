package com.learningjava;
import java.util.Scanner;

public class Game {

    // clean the console by printing 100 empty lines
    public static void cleanConsole() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

        // initialize moves array for the hunter token with empty spaces
        String[][] moves = new String[8][8];
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < moves.length; j++)
                moves[i][j] = " ";
        }

        System.out.println("Welcome to the Hunter and Prey game!");
        System.out.println();

        System.out.println("Please select a position for the prey.");
        System.out.print("Select x-position (A-H): ");
        char preyX = scanner.next().charAt(0);
        System.out.print("Select y-position (1-8): ");
        int preyY = scanner.nextInt();
        System.out.print("Select color: ");
        String preyColor = scanner.next();
        QueenToken prey = new QueenToken(preyX,preyY,preyColor);
        cleanConsole();

        System.out.println("Prey has been positioned. Please select a position for the hunter.");
        System.out.print("Select x-position (A-H): ");
        char hunterX = scanner.next().charAt(0);
        System.out.print("Select y-position (1-8): ");
        int hunterY = scanner.nextInt();
        System.out.print("Select color: ");
        String hunterColor = scanner.next();
        QueenToken hunter = new QueenToken(hunterX,hunterY,hunterColor);
        System.out.println();

        boolean exit = false;
        if(hunter.hits(prey)) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("Hunter hits the prey token! Hunter wins!");
            System.out.println("========================================");
            exit = true;
        }else{
            System.out.println("The prey token is somewhere else... ");
            System.out.println("You have 10 rounds to hit the prey token. Good luck!");
            System.out.println();
        }

        /**
         * update the moves array for printing the hunter position on the board
         * 1st dim: rows, from top (8) to bottom (1), therefore we need "8-hunterY" to go from bottom to top
         * 2nd dim: columns, from A to H, we need to subtract the ascii code offset for array indices 0 to 7
         */
        moves[8-hunterY][hunterX-(int)'A'] = "0";
        // print game board
        Board.printBoard(moves);

        int numberOfRounds = 10;
        while(!exit) {
            System.out.println();

            // exit condition : break loop after 10 rounds
            if(numberOfRounds == 0) {
                System.out.println();
                System.out.println("=======================================");
                System.out.println("The prey token was not hit. Prey wins!");
                System.out.println("=======================================");
                break;
            }

            // new round: read position for next move
            System.out.print("Do you want to move horizontal (-), vertical (|) or diagonal (\\,/)? : ");
            char direction = scanner.next().charAt(0);
            System.out.print("How many field do you want to move? : ");
            int numberOfFields = scanner.nextInt();
            // move hunter token
            hunter.move(direction,numberOfFields);
            System.out.println("Hunter moved to " + hunter.getXpos() + hunter.getYpos() + " .");
            System.out.println();

            // update the moves array for printing the hunter position on the board
            moves[8-hunter.getYpos()][hunter.getXpos()-(int)'A'] = Integer.toString(11-numberOfRounds);
            // print game board
            Board.printBoard(moves);

            if(hunter.hits(prey)) {
                System.out.println();
                System.out.println("========================================");
                System.out.println("Hunter hits the prey token! Hunter wins!");
                System.out.println("========================================");
                break;
            }else{
                System.out.println("Unfortunately no hit was obtained. You have " + (--numberOfRounds) + " rounds left.");
            }
        }
    }
}
