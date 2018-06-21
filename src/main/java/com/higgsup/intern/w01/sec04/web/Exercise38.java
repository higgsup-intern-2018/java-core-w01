package com.higgsup.intern.w01.sec04.web;

import java.util.Arrays;

/*Write a program Yahtzee.java that simulates the rolling of five dice and prints "Yahtzee"
        if all five dice are the same; otherwise it should print "Try again."*/
public class Exercise38 {
    public static void main(String[] args) {
        int numberOfDices = 5;
        int [] myArray = new int[numberOfDices];

        for (int i = 0; i < numberOfDices; i++) {
            myArray[i] = (int) (Math.random()*6) +1;

        }
        System.out.println("The values of dices: " + Arrays.toString(myArray));
        //Compare the values of the arrays
        int count = 0;
        for (int i = 0; i < numberOfDices - 1; i++){
                if (myArray[0]== myArray[i]){
                    count++;
            }
        }
        if ( count == numberOfDices ){
            System.out.println("Yahtzee");
        } else
            System.out.println("Try again");
    }
}
