package com.higgsup.intern.w01.sec02;
/*Write a program SumOfTwoDice.java that prints the sum of two random integers between 1 and 6 (such as you might
        get when rolling dice).*/
public class Exercise20 {
    public static void main(String[] args) {
        int SIZE = 6;
        //(int)(Math.random()*SIZE): số nguyên chạy từ 0->5 với SIZE = 6
        int num1 = 1 + (int)(Math.random()*SIZE); //num1 có thể là 1 -> 6
        int num2 = 1 + (int)(Math.random()*SIZE); //num2 có thể là 1 -> 6

        System.out.println("The first random number: " + num1);
        System.out.println("The second random number: " + num2);
        System.out.println("Sum of two random integers between 1 and 6: " + (num1 + num2));

    }
}
