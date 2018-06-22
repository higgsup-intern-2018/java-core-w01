package com.higgsup.intern.w01.OOP_Part01;

public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime dateAndTime = new DateAndTime(23,59,59,12,31,2018);
        System.out.println("Time before: "+dateAndTime.toString());

        dateAndTime.tick();
        System.out.println("Time after: "+dateAndTime.toString());
    }
}