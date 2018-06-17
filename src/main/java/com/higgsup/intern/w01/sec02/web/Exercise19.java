package com.higgsup.intern.w01.sec02.web;

/*Write a program Divisibility.java that reads in two command line inputs and prints true if both are divisible by 7,
        and false otherwise.*/
public class Exercise19 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        boolean check = (num1 % 7 == 0) && (num2 % 7 == 0);
        System.out.println(check);
    }
}
