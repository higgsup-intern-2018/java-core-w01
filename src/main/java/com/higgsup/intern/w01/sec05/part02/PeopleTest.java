package com.higgsup.intern.w01.sec05.part02;

import com.higgsup.intern.w01.sec05.part02.model.Manager;
import com.higgsup.intern.w01.sec05.part02.model.Employee;
import com.higgsup.intern.w01.sec05.part02.model.Person;

import java.util.Date;

public class PeopleTest {
    public static void main(String[] args) {
        Employee newbie = new Employee ("Newbie", new Date("2/10/1989"), 1000000);
        Manager boss = new Manager("Boss", new Date("2/23/1986"), 4000000);
        boss.setAssistant(newbie);
        Manager biggerBoss = new Manager("Big Boss", new Date("3/12/1969"), 1000000);
        biggerBoss.setAssistant(boss);

        System.out.println(newbie);
        System.out.println(boss);
        System.out.println(biggerBoss);
        System.out.println();

        System.out.println("Exercise 03:");
        Person[] personArray = new Person[]{newbie, boss, biggerBoss};
        for (Object person : personArray){
            System.out.println(person);
        }

    }
}
