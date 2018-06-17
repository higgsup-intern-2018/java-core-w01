package com.higgsup.intern.w01.sec03.web;

public class Exercise49
{
    public static void main(String[] args)
    {
        int pattern = Integer.parseInt(args[0]);

        for(int i = 0; i < pattern; i++)
        {
            for(int x = 0; x < i; x++)
            {
                System.out.print(".");
            }

            for(int y = pattern - i; y > 0; y--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
