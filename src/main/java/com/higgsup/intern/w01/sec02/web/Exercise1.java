package com.higgsup.intern.w01.sec02.web;

public class Exercise1
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("a: " + a + ", b: " + b);
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);
        b = a + b;
        System.out.println("a: " + a + ", b: " + b);
        a = b - a;
        System.out.println("a: " + a + ", b: " + b);
    }
}
