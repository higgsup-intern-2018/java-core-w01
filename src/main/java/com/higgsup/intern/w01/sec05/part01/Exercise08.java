package com.higgsup.intern.w01.sec05.part01;

public class Exercise08 {
    public static void main(String[] args) {
        //1. incrementing into the next minute
        Time2 date1 = new Time2(11, 25, 59);
        date1.tick();
        System.out.println(date1.toString());

        //2. incrementing into the next hour
        Time2 date2 = new Time2(11, 59, 59);
        date2.tick();
        System.out.println(date2.toString());

        //3.incrementing into the next day
        Time2 date3 = new Time2(23, 59, 59);
        date3.tick();
        System.out.println(date3.toString());
    }
}
