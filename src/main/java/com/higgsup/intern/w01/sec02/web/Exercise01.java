package com.higgsup.intern.w01.sec02.web;

public class Exercise01 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 1;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        c = a;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        a = b;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        b = c;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
