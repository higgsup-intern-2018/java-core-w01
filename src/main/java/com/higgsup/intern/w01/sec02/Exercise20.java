package com.higgsup.intern.w01.sec02;


public class Exercise20
{
    public static void main(String[] args) {
        int firstRandom = (int)(Math.random() * 6) + 1;
        int secondRandom = (int)(Math.random() * 6) + 1;

        int sum = firstRandom + secondRandom;
        System.out.println("Sum of two random integers between 1 and 6: " + sum);
    }
}
