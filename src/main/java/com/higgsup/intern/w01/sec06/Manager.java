package com.higgsup.intern.w01.sec06;

import java.util.Date;

public class Manager extends Employee {
    private  Employee assistant;

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public Manager(String name , Date birthday , double salary){
      super(name, birthday, salary);
    }

    public String toString(){
        return super.toString()+ "Assistant: "+assistant.getName();
    }



}
