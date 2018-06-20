package com.higgsup.intern.w01.sec03.web;

public class Exercise44 {
    public static void main(String[] args) {
        int i = 10, a =0, b=0;
        System.out.println("i = " + i);

         i  = i++;
        System.out.println("(i = i++) = " + i);// gia trị i =10 sau do moi tang gia tri len 1

         i= ++i;
        System.out.println("(i = ++i) = " + i);

       a = i++;
       b = ++i;
       i = a + b;
        System.out.println("(i = i++ + ++i) = " + i);
    }
}
