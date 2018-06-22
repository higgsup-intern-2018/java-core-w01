package com.higgsup.intern.w01.sec05.part02.people;

import java.util.Date;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public Employee(String name, Date date, double salary) {
        super(name, date, salary);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (super.toString() + "salary = " + salary );
    }
}
