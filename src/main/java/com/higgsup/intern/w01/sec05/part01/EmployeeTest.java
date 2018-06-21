package com.higgsup.intern.w01.sec05.part01;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Titus", "Thieu", 1020);
        Employee employee2 = new Employee("Dustin", "Thieu", 1500);

        //Display each employee's yearly salary
        System.out.printf("The yearly salary of %s %s is $%1.2f \n",employee1.getFirstName(), employee1.getLastName(), employee1.getSalary()*12);
        System.out.printf("The yearly salary of %s %s is $%1.2f \n",employee2.getFirstName(), employee2.getLastName(), employee2.getSalary()*12);
        System.out.println("===================================================");
        System.out.println("After raising 10% salary");
        System.out.printf("The yearly salary of %s %s is $%1.2f \n",employee1.getFirstName(), employee1.getLastName(), employee1.getSalary()*12*1.1);
        System.out.printf("The yearly salary of %s %s is $%1.2f",employee2.getFirstName(), employee2.getLastName(), employee2.getSalary()*12*1.1);

    }
}
