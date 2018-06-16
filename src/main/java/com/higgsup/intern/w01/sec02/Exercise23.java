package com.higgsup.intern.w01.sec02;
/*Write a program that takes two int values m and d from the command line and prints true if day d of
        month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.*/
public class Exercise23 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean isSpring = (d == 20) && (3 < m) && (m < 6);
        System.out.println(isSpring);
    }
}