package com.higgsup.intern.w01.sec05;

public class Exercise4
{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Exercise4(String firstName, String lastName, double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary > 0){
            this.monthlySalary = salary;
        }
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setSalary(double salary)
    {
        if(salary > 0)
        {
            this.monthlySalary = salary;
        }else{
            this.monthlySalary = 0;
        }
    }

    public String toString()
    {
        return "Employee information: \nFirst name: " + firstName + "\nLast name: " + lastName
                + "\nYearly salary: " + monthlySalary * 12;
    }
}
