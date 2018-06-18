package com.higgsup.intern.w01.sec03.web;

//Zodiac signs. Write a program Zodiac.java that takes two command line integers M and D and
// prints the Zodiac sign corresponding to month M (1 = January, 12 = December) and day D
public class Exercise56 {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int D = Integer.parseInt(args[1]);

        if ((M == 12 && D >= 22 && D <= 31) || (M == 1 && D >= 1 && D <= 19)) {
            System.out.println("Capricorn");
        } else if (((M == 1 && D >= 20 && D <= 31) || (M == 2 && D >= 1 && D <= 17))) {
            System.out.println("Aquarius");
        } else if ((M == 2 && D >= 18 && D <= 28) || (M == 3 && D >= 1 && D <= 19)) {
            System.out.println("Pisces");
        }

    }
}

