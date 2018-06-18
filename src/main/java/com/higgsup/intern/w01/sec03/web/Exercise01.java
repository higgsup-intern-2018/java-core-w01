package com.higgsup.intern.w01.sec03.web;

import java.util.Random;

public class Exercise01 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Dice face: "+dice);
    }
}
