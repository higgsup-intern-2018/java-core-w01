package com.higgsup.intern.w01.sec03.web;

public class Exercise77
{
    public static void main(String[] args) {
        int N = 5;
        String s = "";
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) s = s + i + s;
            else            s = i + s + i;
        }
        System.out.println(s);
    }

    //N = 1 => value of s: 11
    //N = 2 => value of s: 11211
    //N = 3 => value of s: 3112113
    //N = 4 => value of s: 311211343112113
    //N = 5 => value of s: 53112113431121135
}
