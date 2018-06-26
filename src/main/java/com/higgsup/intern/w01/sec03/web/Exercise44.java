package com.higgsup.intern.w01.sec03.web;

public class Exercise44 {
    public static void main(String[] args) {
        int i = 10;
        i = i++; // => i = 10
        i = ++i;
        i = i++ + ++i;
        System.out.println(i);
        //print i = 24
    }
}
