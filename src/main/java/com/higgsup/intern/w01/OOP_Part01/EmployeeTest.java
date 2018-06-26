package com.higgsup.intern.w01.oop_part01;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("=========== Before ===========");
        Employee employee1 = new Employee("Anh","Pham",9000);
        System.out.println("Salary employee 1: "+employee1.getSalary());
        System.out.println();
        Employee employee2 = new Employee("Lam","Nguyen",20000);
        System.out.println("Salary employee 2: "+employee2.getSalary());

        System.out.println("\n=========== After ===========");
        employee1.setSalary(employee1.getSalary());
        System.out.println("Salary employee 1: "+employee1.getSalary());
        System.out.println();
        employee2.setSalary(employee2.getSalary());
        System.out.println("\nSalary employee 2: "+employee2.getSalary());
    }
}
