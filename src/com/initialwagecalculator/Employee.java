package com.initialwagecalculator;

public class Employee {
    private int baseSalary;
    private int hourlyRate; //I can only make the setter with the shortcut. No encapsulation option.
    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
        //calculateWage() //cannot access calculateWage() instance method like this inside this static method b/c calculateWage() method belongs to an employee object.
        //new Employee().calculateWage() //have to create an employee object and then access the method
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return baseSalary;
    }
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate() {
        return hourlyRate;
    }
}
