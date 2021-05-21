package com.learningjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var employee = new Employee(
                "Max Mustermann",
                "Musterstrasse 1, Musterhausen 12345",
                "+49 123 4567890",
                123456,
                50_000,
                42);

        employee.printEmployeeInformation();
        employee.printWage(10);
    }
}
