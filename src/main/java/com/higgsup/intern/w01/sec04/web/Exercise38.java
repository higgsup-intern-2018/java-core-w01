package com.higgsup.intern.w01.sec04.web;
/*Write a program Yahtzee.java that simulates the rolling of five dice and prints "Yahtzee"
        if all five dice are the same; otherwise it should print "Try again."*/
public class Exercise38 {
    public static void main(String[] args) {

        int random1 = (int) (Math.random() * 6) + 1;
        int random2 = (int) (Math.random() * 6) + 1;
        int random3 = (int) (Math.random() * 6) + 1;
        int random4 = (int) (Math.random() * 6) + 1;
        int random5 = (int) (Math.random() * 6) + 1;

        if ((random1==random2)&&(random1==random3)&&(random1==random4)&&(random1==random5)){
            System.out.println("Yahtzee");
        }else System.out.println("Try again");

    }
}
