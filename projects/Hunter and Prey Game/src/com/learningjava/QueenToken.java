package com.learningjava;

public class QueenToken extends Token{
    private final String NAME = "queen";

    // constructor
    public QueenToken(char xPos, int yPos, String color) {
        super(xPos, yPos, color);
    }

    // overload move() method from Token class
    public void move(char direction, int numberOfFields) {
        switch (direction) {
            // move horizontal
            case '-':
                move(numberOfFields, 0);
                break;
            // move vertical
            case '|':
                move(0, numberOfFields);
                break;
            // move diagonal to the right
            case '/':
                move(numberOfFields, numberOfFields);
                break;
            // move diagonal to the left
            case '\\':
                move(-numberOfFields, numberOfFields);
                break;
            default:
                System.out.println("caution: incorrect input ");
        }
    }

    public boolean hits(QueenToken token) {
        return getXpos() == token.getXpos() && getYpos() == token.getYpos();
    }

    @Override
    public String toString() {
        return getColor() + " queen on field " + getXpos() + getYpos();
    }


}
