package com.higgsup.intern.w01.sec06.exercise1_2_3_4;
import java.util.Date;
import com.higgsup.intern.w01.sec06.exercise1_2_3_4.people.Employee;

public class PeopleTest
{
    public static void main(String[] args)
    {
        Employee newbie = new Employee ("Newbie", new Date("2/10/1989"), 1000000);
        Manager boss = new Manager("Boss", new Date("2/23/1986"), 4000000);
        boss.setAssistant(newbie);
        Manager biggerBoss = new Manager("Big Boss", new Date("3/12/1969"), 10000000);
        biggerBoss.setAssistant(boss);
        System.out.println(newbie + "\n");
        System.out.println(boss + "\n");
        System.out.println(biggerBoss + "\n");

        //array hold object
        Employee[] employees = new Employee[]{newbie, boss, biggerBoss};
        for(Employee e : employees)
        {
            System.out.println(e);
            System.out.println();
        }
    }
}
