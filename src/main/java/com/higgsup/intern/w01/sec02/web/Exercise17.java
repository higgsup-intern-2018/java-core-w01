package com.higgsup.intern.w01.sec02.web;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        int x1,y1,x2 , y2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập x1 = ");
        x1 = sc.nextInt();
        System.out.println("Nhập x2 =");
        x2 =sc.nextInt();
        System.out.println("Nhập y1 = ");
        y1 =sc.nextInt();
        System.out.println("Nhập y2 = ");
        y2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2 ));
        System.out.println("Distance ="+distance);
    }
}
