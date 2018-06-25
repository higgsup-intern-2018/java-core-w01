package com.higgsup.intern.w01.sec05;

import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;

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

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    double monthlySalary;

    public Employee(){}

    public Employee(String name , String lastName , double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ  nhân viên: ");
        firstName = sc.nextLine();
        System.out.println("Nhập tên nhân viên:  ");
        lastName = sc.nextLine();
        System.out.println("Nhập lương tháng: ");
        monthlySalary = sc.nextDouble();
    }

    public void Display(){
        System.out.println("print firstname: "+this.firstName);
        System.out.println("Print LastName: "+this.lastName);
        System.out.println("Print monthlySalary: "+this.monthlySalary);
        System.out.println("Tổng lương nhân viên: "+this.totalSalary());
    }

    public double totalSalary(){
        double totalSalary = monthlySalary + monthlySalary * 0.1;
        return totalSalary;
    }
}
