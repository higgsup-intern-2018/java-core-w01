package com.higgsup.intern.w01.sec02;

import java.util.Random;

public class Exercise20
{
    public static void main(String[] args) {
        Random rd = new Random();
        int firstRandom = rd.nextInt(6) + 1;
        int secondRandom = rd.nextInt(6) + 1;

        int sum = firstRandom + secondRandom;
        System.out.println("Sum of two random integers between 1 and 6: " + sum);
    }
}
