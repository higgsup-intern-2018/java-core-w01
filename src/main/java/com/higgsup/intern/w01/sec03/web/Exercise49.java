package com.higgsup.intern.w01.sec03.web;

public class Exercise49 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(". ");
            for (int j = 0; j < n-i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
