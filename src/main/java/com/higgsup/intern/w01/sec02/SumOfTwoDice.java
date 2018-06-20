package com.higgsup.intern.w01.sec02;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int Sides =6;
        int a = 1+ (int) (Math.random() * Sides ); // chọn 1 số ngẫu nhiên từ 1 đến 6*/
        int b = 1+ (int) (Math.random() * Sides);
        int sum = a+b;
        System.out.println(sum);
    }
}
