package com.higgsup.intern.w01.sec04;
//What is wrong with the following code fragment?
public class Exercise05 {
    public static void main(String[] args) {
        //int[] a;  Ta cần khai báo kích thước cho mảng a
        int [] a = new int[8];
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
    }
}
