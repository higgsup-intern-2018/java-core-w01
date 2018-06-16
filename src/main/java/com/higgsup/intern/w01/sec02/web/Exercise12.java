package com.higgsup.intern.w01.sec02.web;

import java.util.Scanner;

//Write a program that reads in three parameters and prints true if all three are equal, and false otherwise.
public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first String: ");
        String str1 = sc.nextLine();

        System.out.print("Input the second String: ");
        String str2 = sc.nextLine();

        System.out.print("Input the third String: ");
        String str3 = sc.nextLine();

        boolean areEqual = str1.equals(str2)&& str1.equals(str3);

        System.out.println(areEqual);
    }
}
