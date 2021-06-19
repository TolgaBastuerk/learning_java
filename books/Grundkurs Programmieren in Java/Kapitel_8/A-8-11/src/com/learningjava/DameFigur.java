package com.learningjava;

public class DameFigur extends Spielfigur{
    private final String NAME = "Dame";

    public DameFigur(char x, int y, String f){
        super(x,y,f);
    }

    public void ziehe(char richtung, int anzahl) {
        switch (richtung) {
            // horizontal ziehen
            case '-':
                ziehe(anzahl, 0);
                break;
            // vertikal ziehen
            case '|':
                ziehe(0, anzahl);
                break;
            // diagonal nach rechts ziehen
            case '/':
                ziehe(anzahl, anzahl);
                break;
            // diagonal nach links ziehen
            case '\\':
                ziehe(anzahl, -anzahl);
                break;
            default:
                System.out.println("Warnung: unzulaessigs Zeichen!");
        }
    }

    public boolean trifft(DameFigur dame) {
        return (getXpos() == dame.getXpos()) && (getYpos() == dame.getYpos());
    }

    public String toString() {
        return "e Dame auf Feld " + getXpos() + getYpos();
    }
}
