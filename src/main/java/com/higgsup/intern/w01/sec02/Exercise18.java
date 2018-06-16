package com.higgsup.intern.w01.sec02;

public class Exercise18
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidian distance of x and y: " + distance);
    }
}
