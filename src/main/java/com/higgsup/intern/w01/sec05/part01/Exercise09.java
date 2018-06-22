package com.higgsup.intern.w01.sec05.part01;

public class Exercise09 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(6, 1, 2018);
        for (int day1 = 0; day1 < 300; day1++) {
            date1.nextDay();
            System.out.println(date1.toString());

        }
    }
}
