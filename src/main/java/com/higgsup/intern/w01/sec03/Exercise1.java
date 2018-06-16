package com.higgsup.intern.w01.sec03;

public class Exercise1
{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && a == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
