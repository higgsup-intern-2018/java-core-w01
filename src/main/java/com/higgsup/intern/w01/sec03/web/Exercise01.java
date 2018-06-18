package com.higgsup.intern.w01.sec03.web;
//Write a program RollDie.java that generates the result of rolling a fair six-sided die (an integer between 1 and 6).
public class Exercise01 {
    public static void main(String[] args) {
        int SIZE = 6;
        int result = (int)(Math.random()*SIZE) + 1; //Ta cần ép kiểu sang int do Math.random()*SIZE có kiểu double
        // cần cộng vs 1 để các số sẽ random trong khoảng từ 1 -> 6
        System.out.println(result);
    }
}
