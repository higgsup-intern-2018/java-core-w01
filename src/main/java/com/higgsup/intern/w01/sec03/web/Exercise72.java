package com.higgsup.intern.w01.sec03.web;

public class Exercise72 {
    public static void main(String[] args) {
        int a = 17, x = 5, y = 12;
        if (x > y) ;
        {
            a = 13;
            x = 23;
        }
        System.out.println(a); //Thường xuyên in ra 13, vì a = 13 không nằm trong vòng if
    }
}
