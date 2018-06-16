package com.higgsup.intern.w01.sec03.web;

public class Exercise8
{
    public static void main(String[] args) {
        int windSpeed = Integer.parseInt(args[0]);
        if(windSpeed >= 155)
        {
            System.out.println("Hurricane category 5");
        }else if(windSpeed >= 131)
        {
            System.out.println("Hurricane category 4");
        }else if(windSpeed >= 111)
        {
            System.out.println("Hurricane category 3");
        }else if(windSpeed >= 96)
        {
            System.out.println("Hurricane category 2");
        }else if(windSpeed >= 74)
        {
            System.out.println("Hurricane category 1");
        }else
            {
                System.out.println("Not a hurricane");
            }

    }
}
