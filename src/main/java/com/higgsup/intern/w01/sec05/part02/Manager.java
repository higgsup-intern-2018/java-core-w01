package com.higgsup.intern.w01.sec05.part02;

import com.higgsup.intern.w01.sec05.part02.people.Employee;

import java.util.Date;

public class Manager extends Employee {
    private Employee assistant;
    private String name;
    private Date birthday;
    private double salary;

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Manager(String name, Date birthday, double salary) {
        super(name, birthday, salary);
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return (super.toString()+"\n - Assistant: " + assistant);
    }
}
