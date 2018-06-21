package session05.part01;

public class Employee {
    private String name;
    private String lastName;
    private double salary;
    public Employee(String name, String lastName,double salary)
    {
        this.name=name;
        this.lastName=lastName;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    private  double sumSalary;
    public void yearSalary()
    {
        if (salary<0)
        {
            System.out.println("0.0");
        }
        else
        {
          sumSalary = (salary*12)+((salary*12)*0.1);
            System.out.println("Year salary of "+getName()+" "+lastName+" is : "+sumSalary);
        }
    }
}
