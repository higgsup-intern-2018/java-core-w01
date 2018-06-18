package com.higgsup.intern.w01.sec03.web;
//Sorting networks. Write a program Sort3.java with three if statements (and no loops) that reads in three integers a, b,
// and c from the command line and prints them out in ascending order.
public class Exercise64 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b) { int t = b; b = a; a = t; }
        if (b > c) { int t = c; c = b; b = t; }
        if (a > c) { int t = c; c = a; a = t; }

        System.out.println(a + " " + b + " " + c);
    }
}
