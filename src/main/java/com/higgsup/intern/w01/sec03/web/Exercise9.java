package com.higgsup.intern.w01.sec03.web;

public class Exercise9
{
    public static void main(String[] args) {
        double x = -32.2;
        boolean isPositive = (x > 0);
        if (isPositive = true) System.out.println(x + " is positive");
        else                   System.out.println(x + " is not positive");
    }
}
    //problem: statement inside if use assignment operator => isPositive always true even if x is not positive

