package com.higgsup.intern.w01.sec02.web;

public class Exercise20
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int s = (a + b + c) / 2;

        double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Triangle area: " + triangleArea);
    }
}
