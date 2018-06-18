package com.higgsup.intern.w01.sec03.web;
//What happens when you try to compile the following code fragment?
public class Exercise84 {
    public static void main(String[] args) {
        double x = 0; //Biến x chưa được khởi tạo
        int a = 8;
        if (a >= 0) x = 3.14;
        if (a <  0) x = 2.71;
        System.out.println(x);
    }
}
