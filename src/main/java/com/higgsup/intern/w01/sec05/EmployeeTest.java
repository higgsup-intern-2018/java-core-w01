package com.higgsup.intern.w01.sec05;

public class EmployeeTest
{
    public static void main(String[] args) {
        //Employee with positive salary
        Employee firstEmployee = new Employee("Ted", "Mosby", 1800);
        System.out.println("First employee yearly salary: " + firstEmployee.getMonthlySalary() * 12);
        //Employee with negative salary
        Employee secondEmployee = new Employee("Lily", "Aldrin", -200);
        System.out.println("Second employee yearly salary: " + secondEmployee.getMonthlySalary() * 12);

        //set negative salary
        System.out.println("Before set negative salary: " + firstEmployee.getMonthlySalary());
        firstEmployee.setSalary(-212.86);
        System.out.println("After set negative salary: " + firstEmployee.getMonthlySalary());

        //set positive array
        System.out.println("Before set positive salary: " + secondEmployee.getMonthlySalary());
        secondEmployee.setSalary(141.25);
        System.out.println("After set positive salary: " + secondEmployee.getMonthlySalary());

        //Raise 10% of each employee salary
        firstEmployee.setSalary(firstEmployee.getMonthlySalary() * 1.1);
        secondEmployee.setSalary(secondEmployee.getMonthlySalary() * 1.1);

        //display each employee yearly salary again
        System.out.println("First employee yearly salary: " + firstEmployee.getMonthlySalary() * 12);
        System.out.println("Second employee yearly salary: " + secondEmployee.getMonthlySalary() * 12);
    }
}
