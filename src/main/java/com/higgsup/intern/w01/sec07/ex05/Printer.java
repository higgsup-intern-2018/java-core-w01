package com.higgsup.intern.w01.sec07.ex05;

public class Printer
{
    public void printInt(int[] arr)
    {
        System.out.print("[" + arr.length + "]:");
        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1] + ";");
    }

    public void printChar(char[] arr)
    {
        System.out.print("[" + arr.length + "]:");
        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1] + ";");
    }

    public void printString(String[] arr)
    {
        System.out.print("[" + arr.length + "]:");
        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1] + ";");
    }
}
