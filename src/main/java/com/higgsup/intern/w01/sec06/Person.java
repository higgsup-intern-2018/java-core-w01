package com.higgsup.intern.w01.sec06;

import java.util.Date;

public class Person {

    private String name;
    private Date birthday;

    public Person(){
    }

    public Person(String name , Date birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Name:"+this.name+",Birthday: "+this.birthday;
    }


}
