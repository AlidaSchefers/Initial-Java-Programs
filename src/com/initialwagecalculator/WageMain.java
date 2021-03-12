package com.initialwagecalculator;

public class WageMain {
    public static void main(String[] args) { //main method is declared static to enable Java runtime to directly call this method without having to create a new object.
        var employee = new Employee(
                50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
