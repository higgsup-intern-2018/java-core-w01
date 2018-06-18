package com.higgsup.intern.w01.sec02;

import java.util.Random;

public class Exercise20 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(6)+1;
        int b = rand.nextInt(6)+1;
        int sum = a + b;
        System.out.println("Result: "+sum);
    }
}
