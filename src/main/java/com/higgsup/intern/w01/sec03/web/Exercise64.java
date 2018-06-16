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
            swap = a;
            a = b;
            b = swap;
        }
        if(a > c)
        {
            swap = a;
            a = c;
            c = swap;
        }
        if(b > c)
        {
            swap = b;
            b = c;
            c = swap;
        }

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}
