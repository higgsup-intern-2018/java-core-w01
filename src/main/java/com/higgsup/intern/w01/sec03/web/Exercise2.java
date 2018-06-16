package com.higgsup.intern.w01.sec03.web;

public class Exercise2
{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if(a == b)
        {
            if(a == c)
            {
                System.out.println("Distinct values: 1");
            }else {
                System.out.println("Distinct values: 2");
            }
        }
        else {
            if(a == c) {
                System.out.println("Distinct values: 2");
            }else {
                System.out.println("Distinct values: 3");
            }
        }
    }
}
