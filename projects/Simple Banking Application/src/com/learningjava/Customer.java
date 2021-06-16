package com.learningjava;

import java.util.Date;

public class Customer {
    public BankAccount account;
    private String firstName;
    private String lastName;
    private String address;
    private String birthDate;
    private int id;

    private static int idCounter = 1;

    /** custom constructor **/
    public Customer(String firstName,
                    String lastName,
                    String address,
                    String birthDate) {
        id = idCounter++;
    }

    /** methods **/
    public void createBankAccount() {
        account = new BankAccount();
    }

    /** getter and setter methods **/
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

}
