package com.learningjava;

public class Customer {
    public BankAccount account;
    private String firstName;
    private String lastName;
    private String address;
    private String birthDate;
    private boolean hasBankAccount;
    private int id;

    private static int idCounter = 1;

    /** custom constructor **/
    public Customer(String firstName,
                    String lastName,
                    String address,
                    String birthDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setBirthDate(birthDate);
        id = idCounter++;
    }

    /** methods **/
    public void createBankAccount() {
        account = new BankAccount();
        hasBankAccount = true;
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

    public boolean getHasBankAccount() { return hasBankAccount; }

}
