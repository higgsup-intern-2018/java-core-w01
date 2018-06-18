package com.higgsup.intern.w01.sec02;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        double b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập b = ");
        b=sc.nextDouble();
        System.out.println("Nhập c = ");
        c=sc.nextDouble();

        double discriminant = b*b-4.0 *c;
        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b+sqroot) / 2.0;
        double root2 = (-b-sqroot) / 2.0;

        System.out.println(root1);
        System.out.println(root2);


    }
}
