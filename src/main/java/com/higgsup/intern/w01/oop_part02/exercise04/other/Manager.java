package com.higgsup.intern.w01.oop_part02.exercise04.other;

import com.higgsup.intern.w01.oop_part02.exercise01.Employee;

import java.util.Date;

 class Manager extends Employee{
    private Employee assistant;

    public Manager(String name, Date birthday, double salary, Employee assistant) {
        super(name, birthday, salary);
        this.assistant = assistant;
    }

    public Manager(String name, Date birthday, double salary) {
        super(name, birthday, salary);
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

    @Override
    public String toString() {
        return super.toString()+this.getAssistant();
    }
}
