package com.higgsup.intern.w01.sec04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int []a = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("\na["+i+"] = ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        System.out.print("\nArray: ");
        for (int i = 0; i<n; i++){
            System.out.print(a[i]+"  ");
        }
        System.out.print("\nReverse Array: ");
        for (int i = n-1; i>=0;i--){
            System.out.print(a[i]+"  ");

        }
    }
}
