package com.higgsup.intern.w01.sec03;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        System.out.println("Input number of hello sentences: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<= n; i++){
            if((i % 10 == 1) || (i % 100 == 1)){
                System.out.println(i+"st Hello.");
            }
            if((i % 10 == 2) || (i % 100 == 2)){
                System.out.println(i+"nd Hello.");
            }
            if((i % 10 == 3) || (i % 100 == 3)){
                System.out.println(i+"rd Hello.");
            } else{
                System.out.println(i+"th Hello.");
            }
        }
    }
}
