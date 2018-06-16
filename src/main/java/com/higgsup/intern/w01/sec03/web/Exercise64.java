package com.higgsup.intern.w01.sec03.web;

public class Exercise64
{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int swap;
        if(a > b)
        {
            b = a-b;
            a = a-b;
            b = a+b;
        }
        if(a > c)
        {
            c = a-c;
            a = a-c;
            c = a+c;
        }
        if(b > c)
        {
            c = b-c;
            b = b-c;
            c = b+c;
        }

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}
