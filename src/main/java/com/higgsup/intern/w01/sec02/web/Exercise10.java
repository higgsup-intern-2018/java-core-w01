package com.higgsup.intern.w01.sec02.web;

public class Exercise10 {
    public static void main(String[] args)
    {
        String f0 = "a";
        String f1 = "b";
        String f2 = f1+f0;
        String f3 = f2 + f1;
        String f4 = f3 + f2;
        String f5 = f4 + f3;
        String f6 = f5 + f4;
        String f7 = f6 + f5;
        String f8 = f7 + f6;
        String f9 = f8 + f7;
        String f10 = f9 + f8;

        System.out.println("Fibonacci word: ");
        System.out.println("f(0): " + f0);
        System.out.println("f(1): " + f1);
        System.out.println("f(2): " + f2);
        System.out.println("f(3): " + f3);
        System.out.println("f(4): " + f4);
        System.out.println("f(5): " + f5);
        System.out.println("f(6): " + f6);
        System.out.println("f(7): " + f7);
        System.out.println("f(8): " + f8);
        System.out.println("f(9): " + f9);
        System.out.println("f(10): " + f10);
    }
}
