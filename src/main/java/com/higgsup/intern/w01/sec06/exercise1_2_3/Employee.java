package com.higgsup.intern.w01.sec06.exercise1_2_3;

import java.util.Date;

public class Employee extends Person
{
    private double salary;

    public Employee(String name, Date birthday, double salary)
    {
        super(name, birthday);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString()
    {
        return super.toString() + "\nSalary: " + salary;
    }
}
