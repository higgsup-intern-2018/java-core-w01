package com.higgsup.intern.w01.sec03.web;
//What is the value of i after the following confusing code is executed?
public class Exercise44 {
    public static void main(String[] args) {
        int i = 10;
        i = i++; // i=11
        i = ++i; // i=12
        i = i++ + ++i; //i=12+12=24
        System.out.println(i); //i=24
    }
}
