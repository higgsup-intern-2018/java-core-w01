package com.higgsup.intern.w01.sec02;

public class Exercise01 {
    public static void main(String[] args) {
        int a = 5;      //sets a equal 5
        int t = a;      //sets t equal a
        int b = t;      //sets b equal t
        a = b;          //sets a equal b

        System.out.println(a); //prints 5
        System.out.println(b); //prints 5
        System.out.println(t); //prints 5
    }
}
