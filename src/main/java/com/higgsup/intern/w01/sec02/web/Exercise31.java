package com.higgsup.intern.w01.sec02.web;
import java.util.*;
public class Exercise31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double degree;
        System.out.println("Nhập số degree: ");
        degree = sc.nextDouble();
        double radians = Math.toRadians(degree);

        double s = Math.sin(radians);
        System.out.println("Sin("+degree+")= "+s);

        double c = Math.cos(radians);
        System.out.println("cos(" + degree+ ") = " + c);

        double t = Math.tan(radians);
        System.out.println("tan(" + degree + ") = " + t);




    }
}
