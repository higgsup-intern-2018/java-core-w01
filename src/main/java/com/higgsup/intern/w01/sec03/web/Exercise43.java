package com.higgsup.intern.w01.sec03.web;

public class Exercise43 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);        // original integer

        // reverse using arithmetic
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);

    }
}
