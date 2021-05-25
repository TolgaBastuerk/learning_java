package com.learningjava;

import java.text.NumberFormat;

public class Employee {
    private String name;
    private String address;
    private String mobile;
    private int employeeId;
    private int baseSalary;
    private int hourlyRate;

    // custom constructor
    public Employee(
            String name,
            String address,
            String mobile,
            int employeeId,
            int baseSalary,
            int hourlyRate) {
        setName(name);
        setAddress(address);
        setMobile(mobile);
        setEmployeeId(employeeId);
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    // class methods
    private int calculateWage(int extraHours) {
        if (extraHours < 0)
            throw new IllegalArgumentException("Extra hours must be greater than or equal to 0.");
        return baseSalary + getHourlyRate() * extraHours;
    }
    public void printEmployeeInformation() {
        System.out.println();
        System.out.println("Employee Name    : " + name);
        System.out.println("Employee Address : " + address);
        System.out.println("Employee Mobile  : " + mobile);
        System.out.println("Employee Id      : " + employeeId);
    }
    public void printWage(int extraHours) {
        int wage = calculateWage(extraHours);
        System.out.println();
        System.out.println("Employee base salary : " + NumberFormat.getCurrencyInstance().format(baseSalary));
        System.out.println("Employee hourly rate : " + NumberFormat.getCurrencyInstance().format(hourlyRate));
        System.out.println("Employee extra hours : " + extraHours);
        System.out.println("Calculated annually wage is " + NumberFormat.getCurrencyInstance().format(wage) + ".");
    }

    // setter and getter: name
    public void setName(String name) {
        if (name.length() > 100 || name.length() < 2)
            throw new IllegalArgumentException("Employee name must be less than 100 and greater than 1 character long.");
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // setter and getter: address
    public void setAddress(String address) {
        if (address.length() > 100 || address.length() < 2)
            throw new IllegalArgumentException("Employee address must be less than 100 and greater than 1 character long.");
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    // setter and getter: mobile
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return mobile;
    }

    // setter and getter: employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    // setter and getter: baseBalary
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base salary must be greater than 0.");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    // setter and getter: hourlyRate
    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate must be greater than 0.");
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }

}
