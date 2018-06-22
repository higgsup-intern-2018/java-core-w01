package com.higgsup.intern.w01.sec06.exercise1_2_3_4;

import java.util.Date;
import com.higgsup.intern.w01.sec06.exercise1_2_3_4.people.Employee;

public class Manager extends Employee
{
    private Employee assistant;

    public Manager(String name, Date birthday, double salary)
    {
        super(name, birthday, salary);
    }

    public void setAssistant(Employee assistant)
    {
        this.assistant = assistant;
    }

    public String toString()
    {
        return super.toString() + "\nAssistant: " + assistant.getName();
    }
}
