package com.higgsup.intern.w01.oop_part02.exercise01;

import java.util.Date;

public class Employee extends Person{
    private double salary;

    public Employee(String name, Date birthday, double salary) {
        super(name, birthday);
        this.salary = salary;
    }

    public Employee(String name, Date birthday) {
        super(name, birthday);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+" --- "+getSalary()+" --- ";
    }
}
