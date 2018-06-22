package com.higgsup.intern.w01.sec05.part02.people;

import java.util.Date;

public class Person {
    private String name;
    private Date birthday;
    private double salary;


    public Person(String name, Date birthday, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", birthday = " + birthday + ", ";
    }
}
