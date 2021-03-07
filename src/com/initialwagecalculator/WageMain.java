package com.initialwagecalculator;

public class WageMain {
    public static void main(String[] args) {
        var employee = new Employee(
                50_000, 20);
        System.out.println(Employee.numberOfEmployees);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
