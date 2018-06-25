package session05.part02;

import session05.part02.people.Employee;

import java.util.Date;

public class Manager extends Employee {
    private Employee assistant;
    public Manager(String name, Date birthday, double salary){
        super(name, birthday, salary);
    }
    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
    @Override
    public String toString(){

        return (super.toString()+"\nAssistant "+assistant);
    }
}
