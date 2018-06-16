package com.higgsup.intern.w01.sec02.web;
//Write a program to see what happens when you divide an int or double by zero.

public class Exercise08 {
    public static void main(String[] args) {

        //System.out.println(3/0); ArithmeticException by zero
        //System.out.println(3%0); ArithmeticException by zero
        System.out.println(3.5/0.0); //Infinity: vô cực
        System.out.println(3.5%0.0); //NaN: not a number.
    }
}
