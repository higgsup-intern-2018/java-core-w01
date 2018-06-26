package com.higgsup.intern.w01.oop_part01;

public class Time2Test_Exercise8 {
    public static void main(String[] args) {
        Time2_Exercise8 time2 = new Time2_Exercise8(23,59,59);
        System.out.println(String.format("Time before: %02d:%02d:%02d",time2.getHour(), time2.getMinute(), time2.getSecond()));
        time2.tick();
        System.out.println(String.format("Time after: %02d:%02d:%02d",time2.getHour(), time2.getMinute(), time2.getSecond()));
    }
}
