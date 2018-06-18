package com.higgsup.intern.w01.sec03.web;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int mid = (a.length/2);
        for (int i = 0; i < a.length; i++){
            System.out.print("\na["+i+"] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Median value: "+a[mid]);
    }
}
