package com.higgsup.intern.w01.sec02;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập x = ");
        x=sc.nextInt();
        System.out.println("Nhập y = ");
        y=sc.nextInt();
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("Distance from("+x+","+y+") to (0,0)= "+distance);
    }

}
