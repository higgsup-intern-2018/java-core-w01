package com.higgsup.intern.w01.sec03;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        boolean isEqual = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a: ");
        a = sc.nextInt();
        System.out.println("Input number b: ");
        b = sc.nextInt();
        System.out.println("Input number c: ");
        c = sc.nextInt();

        if((a == b) &&(b == c)){
            isEqual = true;
        } else {
            isEqual = false;
        }
        System.out.println(isEqual);
    }
}
