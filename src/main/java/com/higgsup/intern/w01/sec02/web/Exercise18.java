package com.higgsup.intern.w01.sec02.web;

public class Exercise18
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean b = (x < y && y < z) || (x > y && y > z);
        System.out.println(b);
    }
}
