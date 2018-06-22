package com.higgsup.intern.w01.sec05.part02.model;

import java.util.Date;

public class Person {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
