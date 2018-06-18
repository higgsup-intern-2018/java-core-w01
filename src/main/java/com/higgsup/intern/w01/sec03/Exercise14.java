package com.higgsup.intern.w01.sec03;

public class Exercise14 {
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
        //print to fibonanci
    }
}
