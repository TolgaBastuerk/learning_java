package com.learningjava;

// Beliebige Spielfigur auf dem Schachbrett
public class Spielfigur {

    // x-Koordinate (A - H) der Position der Figur
    private char xPos;

    // y-Koordinate (1 - 8) der Position der Figur
    private int yPos;

    // Farbe der Spielfigur
    private String farbe;

    // Konstruktur
    public Spielfigur (char x, int y, String f) {
        xPos = x;       // belege x-Position
        yPos = y;       // belege y-Position
        farbe = f;      // belege Farbe
        // Korrigiere eventuell falsche Positionsangaben
        korrigierePosition();
    }

    // korrgiert die Positionsangaben
    private void korrigierePosition() {
        if(xPos < 'A')
            xPos = 'A';
        else if (xPos > 'H')
            xPos = 'H';
        if(yPos < 1)
            yPos = 1;
        else if(yPos > 8)
            yPos = 8;
    }

    // liefert den Wert der Instanzvariable xPos
    public char getXpos() {
        return xPos;
    }

    // liefert den Wert der Instanzvariable yPos
    public int getYpos() {
        return yPos;
    }

    // liefert den Wert der Instanzvariable farbe
    public String getFarbe() {
        return farbe;
    }

    /* bewegt die Figur
       um xF Felder nach rechts (< 0 nach links) und
       um yF Felder nach oben (< 0 nach unten)
     */
    public void ziehe (int xF, int yF) {
        xPos = (char) (xPos + xF);
        yPos = yPos + yF;
        korrigierePosition();
    }

    // liefert String-Darstellung des Spielfigur Objekts
    @Override
    public String toString() {
        return farbe + "e Figur auf Feld " + xPos + yPos;
    }
}
