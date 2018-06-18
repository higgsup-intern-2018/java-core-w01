package com.higgsup.intern.w01.sec02;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Nhập x = ");
        x= sc.nextInt();
        System.out.println("Nhập y = ");
        y=sc.nextInt();

        boolean isDivisible = (x% 7 ==0) &&(y%7 ==0);
        System.out.println(isDivisible);
    }
}
