package com.higgsup.intern.w01.sec03.web;

public class Exercise64 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
//        if (a > b) swap a and b
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a = "+a+" b = "+b);
        }
//        if (a > c) swap a and c
        if(a > c){
            int temp = a;
            a = c;
            c = temp;
            System.out.println("a = "+a+" c = "+c);
        }
//        if (b > c) swap b and c
        if(b > c){
            int temp = a;
            a = c;
            c = temp;
            System.out.println("b = "+b+" c = "+c);
        }
        System.out.println("a = "+a+" b = "+b+" c = "+c);
    }
}
