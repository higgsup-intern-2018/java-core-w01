package com.higgsup.intern.w01.sec02.web;

//Fibonacci word of order 0 through 10
public class Exercise10 {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        String str3;

        System.out.println("f[0] = " + str1);
        System.out.println("f[1] = " + str2);
        for (int i = 2; i <= 10; i++){
            str3 = str2 + str1;
            System.out.printf("f[%d] = %s", i, str3);
            System.out.println();
            str1 = str2;
            str2 = str3;
        }
    }
}
