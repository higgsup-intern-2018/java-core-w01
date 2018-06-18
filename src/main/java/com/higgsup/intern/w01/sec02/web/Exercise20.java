package com.higgsup.intern.w01.sec02.web;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input side a: ");
        a = sc.nextInt();
        System.out.print("\nInput side b: ");
        b = sc.nextInt();
        System.out.print("\nInput side c: ");
        c = sc.nextInt();
        if (a+b > c && a+c > b && b+c > a){
            System.out.println("Triangle has 3 side : "+a+" "+b+" "+c);
            double s = s = (a + b + c) / 2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Are of triangle is: "+area);
        } else {
            System.out.println("This is not a triangle");
        }
    }
}
