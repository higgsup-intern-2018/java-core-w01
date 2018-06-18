package com.higgsup.intern.w01.sec02.web;

public class Exercise01 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int temp = 0;
        System.out.println("a = "+a+" b= "+b+" temp= "+temp);
        temp = a;
        System.out.println("a = "+a+" b= "+b+" temp= "+temp);
        a = b;
        System.out.println("a = "+a+" b= "+b+" temp= "+temp);
        b = temp;
        System.out.println("a = "+a+" b= "+b+" temp= "+temp);
    }
}
