package com.higgsup.intern.w01.sec03;

public class Exercise14 {
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
/*Kết quả:
        0
        1
        1
        2
        3
        5
        8
        13
        21
        34
        55
        89
        144
        233
        377
        610*/

