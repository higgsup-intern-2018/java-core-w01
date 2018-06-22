package com.higgsup.intern.w01.sec05.part02.model;

public class Manager extends Employee {
    private Employee assistant;

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "assistant=" + assistant +
                '}';
    }
}
