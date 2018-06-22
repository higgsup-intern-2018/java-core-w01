package com.higgsup.intern.w01.sec05.part01;

public class Exercise10 {
    public static void main(String[] args) {
        DateAndTime dateAndTime = new DateAndTime(1, 1, 2018,23,59, 59);
        for (int second = 0; second < 200; second++){
            dateAndTime.tick();
            dateAndTime.toString();
            System.out.println(dateAndTime.toUniversalString());
        }


    }
}
