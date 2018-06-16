package com.higgsup.intern.w01.sec02.web;

public class Exercise19
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        boolean isTrue = (x % 7 == 0) && (y % 7 == 0);
        System.out.println(isTrue);
    }
}
