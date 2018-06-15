package com.higgsup.intern.w01.sec02;

public class Exercise04 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println((!(a < b) && !(a > b)));

        //Solution: Simplify the upper expression
        System.out.println(a == b);

    }
}
