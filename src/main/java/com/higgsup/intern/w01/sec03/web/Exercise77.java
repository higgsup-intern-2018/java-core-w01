package com.higgsup.intern.w01.sec03.web;

import java.util.Scanner;

public class Exercise77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        String s = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) s = s + i + s;
            else            s = i + s + i;
        }
        System.out.println(s);
    }
}
