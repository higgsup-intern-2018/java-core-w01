package com.higgsup.intern.w01.sec02.web;

public class Exercise02 {
    public static void main(String[] args) {
        int grade = Integer.parseInt(args[0]);
        //boolean isA = (90 <= grade <= 100); //error
        boolean isA = (90 <= grade)&&(grade <= 100);
        System.out.println(isA);
    }
}
