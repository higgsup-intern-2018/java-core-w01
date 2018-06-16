package com.higgsup.intern.w01.sec02.web;

public class Exercise8
{
    public static void main(String[] args) {
        int x = 17 / 0;             // / by zero exception
        double y = 17.0 / 0.0;        // infinity

        System.out.println(x);
        System.out.println(y);
    }
}
