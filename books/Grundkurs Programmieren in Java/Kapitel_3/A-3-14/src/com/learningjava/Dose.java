package com.learningjava;

public class Dose {
    private double umfang;
    private double hoehe;
    private final double PI = 3.141592;

    public double getHoehe() {
        return hoehe;
    }
    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }
    public double getUmfang() {
        return umfang;
    }
    public void setUmfang(double umfang) {
        this.umfang = umfang;
    }

    public Dose(double umfang, double hoehe) {
        this.hoehe = hoehe;
        this.umfang = umfang;
    }

    private double durchmesserDosenboden() {
        return getUmfang() / PI;
    }
    private double flaecheDosenboden() {
        return PI * Math.pow(durchmesserDosenboden()/2.0,2);
    }
    private double mantelflaecheDose() {
        return getUmfang()*getHoehe();
    }
    private double gesamtflaecheDose() {
        return 2 * flaecheDosenboden() + mantelflaecheDose();
    }
    private double volumenDose() {
        return flaecheDosenboden() * getHoehe();
    }

    public void informationen(){
        System.out.println("Hoehe der Dose = " + getHoehe());
        System.out.println("Umfang der Dose = " + getUmfang());
        System.out.println("Durchmesser des Dosenbodens = " + durchmesserDosenboden());
        System.out.println("Flaeche des Dosenbodens = " + flaecheDosenboden());
        System.out.println("Mantelflaeche der Dose = " + mantelflaecheDose());
        System.out.println("Gesamtflaeche der Dose = " + gesamtflaecheDose());
        System.out.println("Volumen der Dose = " + volumenDose());
    }





}
