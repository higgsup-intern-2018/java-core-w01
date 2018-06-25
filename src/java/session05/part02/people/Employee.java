package session05.part02.people;

import java.util.Date;

public class Employee extends Person {
    private double salary;
    public Employee(String name, Date birthday, double salary)
    {
        super(name,birthday);
        this.salary=salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString()
    {
        return (super.toString() + "\n     Salary : "+salary);
    }
}
