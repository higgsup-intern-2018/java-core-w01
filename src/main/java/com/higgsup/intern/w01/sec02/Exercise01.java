package com.higgsup.intern.w01.sec02;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a =sc.nextInt();
        System.out.println("Nhập b = ");
        b=sc.nextInt();
        int c=0;

        System.out.println("\n a= " + a + "\n b= "+ b +"\n c= "+c);
        c=a;
        System.out.println("\n a= " + a + "\n b= "+ b +"\n c= "+c);
        a=b;
        System.out.println("\n a= " + a + "\n b= "+ b +"\n c= "+c);
        b=c;
        System.out.println("\n a= " + a + "\n b= "+ b +"\n c= "+c);



    }





}
