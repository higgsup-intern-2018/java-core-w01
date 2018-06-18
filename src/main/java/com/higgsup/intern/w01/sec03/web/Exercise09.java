package com.higgsup.intern.w01.sec03.web;

public class Exercise09 {
    public static void main(String[] args) {
        double x = -32.2;
        boolean isPositive = (x > 0);
        if (isPositive) System.out.println(x + " is positive"); //Chuyển thành == để so sánh giá trị. Nên dùng if(isPositive)
        else                   System.out.println(x + " is not positive");
    }
}
