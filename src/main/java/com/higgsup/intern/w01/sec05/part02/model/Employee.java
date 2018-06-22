package com.higgsup.intern.w01.sec05.part02.model;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
