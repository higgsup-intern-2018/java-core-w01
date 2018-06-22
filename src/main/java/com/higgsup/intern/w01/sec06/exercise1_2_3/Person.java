package com.higgsup.intern.w01.sec06.exercise1_2_3;

import java.util.Date;

public class Person
{
    private String name;
    private Date birthday;

    public Person(String name, Date birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName(){
        return name;
    }

    public String toString()
    {
        return "People information: \nName: " + name + "\nBirthday: " + birthday.toString();
    }
}
