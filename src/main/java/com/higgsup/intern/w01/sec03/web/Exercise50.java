package com.higgsup.intern.w01.sec03.web;
//Write a program Ex.java that takes a command-line argument N and prints a (2N + 1)-by-(2N + 1) ex like the one below.
// Use two for loops and one if-else statement.
public class Exercise50 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if ((i == -j) || (i == j)) System.out.print("* ");
                else                       System.out.print(". ");
            }
            System.out.println();
        }
    }
}
