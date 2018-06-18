package com.higgsup.intern.w01.sec03.web;

/*Write a program that takes three integer command-line arguments a, b, and c
        and print the number of distinct values (1, 2, or 3) among a, b, and c.*/
public class Exercise02 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int distinctValue;

        if ((a == b) && (a != c)) {
            distinctValue = c;
        } else if ((a == c) && (a != b)){
            distinctValue = b;
        } else
            distinctValue = a;
        System.out.println("The number of distinct value: " + distinctValue);
    }
}
