package com.higgsup.intern.w01.sec03.web;

public class Exercise43
{
    public static void main(String[] args) {
        int M = 987654321;
        String s = "";
        while (M != 0) {
            int digit = M % 10;
            s = s + digit;
            M = M / 10;
        }
        System.out.println(s);
    }

    //value of s: 123456789
}
