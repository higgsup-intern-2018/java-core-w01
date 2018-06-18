package com.higgsup.intern.w01.sec03.web;

public class Exercise52
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (Math.abs(i) + Math.abs(j) <= n) {
                    System.out.print("* ");
                } else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

