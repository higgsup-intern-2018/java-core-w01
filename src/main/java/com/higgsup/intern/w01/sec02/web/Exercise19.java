package com.higgsup.intern.w01.sec02.web;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        int a;
        int b;
        boolean isDiv = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number a: ");
        a = sc.nextInt();
        System.out.print("\nInput number b: ");
        b = sc.nextInt();

        if((a % 7 == 0) && (b % 7 == 0)){
            isDiv = true;
        } else {
            isDiv = false;
        }
        System.out.println(isDiv);
    }
}
