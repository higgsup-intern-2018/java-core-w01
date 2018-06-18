package com.higgsup.intern.w01.sec02.web;
import java.util.Scanner;
public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area ;
        int a,b,c;
        System.out.println("Nhập a= ");
        a = sc.nextInt();
        System.out.println("Nhập b= ");
        b=sc.nextInt();
        System.out.println("Nhập c= ");
        c=sc.nextInt();

        int s =(a+b+c)/3;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Giá trị area là: "+area);

    }
}
