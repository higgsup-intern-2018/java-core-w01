package com.higgsup.intern.w01.oop_part01;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (this.salary <0){
            this.salary = 0.0;
        } else{
            this.salary = salary+(salary*10)/100;
        }
    }
    public Employee(){

    }

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
