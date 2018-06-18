package com.higgsup.intern.w01.sec03.web;
    //What is the value of s after executing the following code
public class Exercise43 {
    public static void main(String[] args) {
        int M = 987654321;
        String s = "";
        while (M != 0) {
            int digit = M % 10;
            s = s + digit;
            M = M / 10;
        }
        System.out.println(s);  //s = "123456789"
    }
}
/*
Giải thích: 1. digit = 987654321 % 10 = 1 ; s = 1, M = 98765432
              2. digit = 98765432 % 10 = 2; s = 12, M = 9876543
              tương tự s = 123456789*/
