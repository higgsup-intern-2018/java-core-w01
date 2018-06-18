package com.higgsup.intern.w01.sec03.web;
//Seasons. Write a program Season.java that takes two command line integers M and D and prints the season corresponding
// to month M (1 = January, 12 = December) and day D in the northern hemisphere.
/*Spring: (M = 3, D = 21) -> (M = 6, D = 20)
Summer: (M = 6, D = 21) -> (M = 9, D = 22)
Fall: (M = 9, D = 23) -> (M = 12, D = 21)
Winter: (M = 12, D = 21) -> (M = 3, D = 20)*/

public class Exercise55 {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int D = Integer.parseInt(args[1]);

        if ((M == 3 && D >= 21 && D <= 31) || (M == 4 && D >= 1 && D <= 30)
                || (M == 5 && D >= 1 && D <= 31) || (M == 6 && D >= 1 && D <= 20)) {
            System.out.println("This is the Spring!");
        } else if ((M == 6 && D >= 21 && D <= 30) || (M == 7 && D >= 1 && D <= 31)
                || (M == 8 && D >= 1 && D <= 31) || (M == 9 && D >= 1 && D <= 22)) {
            System.out.println("This is the Summer!");
        } else if ((M == 9 && D >= 23 && D <= 30) || (M == 10 && D >= 1 && D <= 31)
                || (M == 11 && D >= 1 && D <= 30) || (M == 12 && D >= 1 && D <= 21)) {
            System.out.println("This is the Fall!");
        } else if ((M == 12 && D >= 21 && D <= 31) || (M == 1 && D >= 1 && D <= 31)
                || (M == 2 && D >= 1 && D <= 28) || (M == 3 && D >= 1 && D <= 20)) {
            System.out.println("This is the Winter!");
        } else System.out.println("The wrong input!");

    }
}
