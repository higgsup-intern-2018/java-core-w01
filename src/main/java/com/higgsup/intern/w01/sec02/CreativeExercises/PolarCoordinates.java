package com.higgsup.intern.w01.sec02.CreativeExercises;

import java.util.Scanner;

public class PolarCoordinates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x,y;

        System.out.println("Nhập x = ");
        x=sc.nextDouble();
        System.out.println("Nhập y = ");
        y=sc.nextDouble();

       double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y,x);
        System.out.println("R ="+r);
        System.out.println("theta ="+theta);
    }
}
