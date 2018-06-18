package com.higgsup.intern.w01.sec02.web;

public class Exercise08 {
    public static void main(String[] args) throws ArithmeticException{
        int a = Integer.parseInt(args[0]);
        System.out.println(((double)a)+" / 0.0 = "+((double)a)/0);  //Infinity
        System.out.println(((double)a)+" % 0.0 = "+((double)a)%0);  //NaN

        System.out.println(a+" / 0 = "+a/0);    //ArithmeticException
        System.out.println(a+" % 0 = "+(a%0));  //ArithmeticException
    }
}
