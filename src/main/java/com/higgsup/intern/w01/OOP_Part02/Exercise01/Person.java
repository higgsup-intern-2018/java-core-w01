package com.higgsup.intern.w01.oop_part02.exercise01;

import com.higgsup.intern.w01.oop_part01.DateAndTime;

import java.util.Date;

public class Person {
    private String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString(){
        return getName()+" --- "+getBirthday();
    }
}
