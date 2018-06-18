package com.higgsup.intern.w01.sec03.web;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = sc.nextInt();
        System.out.println("Input number b: ");
        int b = sc.nextInt();
        System.out.println("Input number c: ");
        int c = sc.nextInt();

        if(a == b && b == c){
            System.out.println("Distint value: "+a);
        }
        if(a == b && b != c){
            System.out.println("Distint value: "+a+" "+c);
        }
        if(a != b && a == c){
            System.out.println("Distint value: "+b+" "+c);
        }if(a != b && b == c){
            System.out.println("Distint value: "+a+" "+c);
        }
        if(a != b && b != c && c!= a){
            System.out.println("Distint value: "+a+" "+b+" "+c);
        }
    }
}
