package com.higgsup.intern.w01.sec04;

public class Exercise5
{
    public static void main(String[] args)
    {
        int[] a;
        for (int i = 0; i < 10; i++)
            a[i] = i * i; //compile error: variable a might not have been initialized
    }
}
