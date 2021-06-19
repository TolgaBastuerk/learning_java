package com.learningjava;

// any game piece or token
public class Token {

    // x-coordinate (A-H) of the token
    private char xPos;

    // y-coordinate (1-8) of the token
    private int yPos;

    // color of the token
    private String color;

    // constructor
    public Token(char xPos, int yPos, String color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;

    }

    // correction of the positioning
    private void correctPosition() {
        if(xPos < 'A')
            xPos = 'A';
        else if (xPos > 'H')
            xPos = 'H';
        if(yPos < 1)
            yPos = 1;
        else if(yPos > 8)
            yPos = 8;
    }

    public char getXpos() {
        return xPos;
    }
    public int getYpos() {
        return yPos;
    }
    public String getColor() {
        return color;
    }

    /**
     * moves the token
     * for moveX fields to the right (< 0 to the left) and
     * for moveY fields upwards (< 0 downwards)
     */
    public void move(int moveX, int moveY) {
        xPos = (char) (xPos + moveX);
        yPos = yPos + moveY;
        correctPosition();
    }

    @Override
    public String toString() {
        return color + " token on field " + xPos + yPos;
    }

}
