package com.higgsup.intern.w01.sec03.web;

public class Exercise84
{
    public static void main(String[] args) {
        int a = 8;
        double x;
        if (a >= 0) x = 3.14;
        if (a <  0) x = 2.71;
        System.out.println(x);
    }

    //compile error: variable x might not have been initialized
}
