package com.higgsup.intern.w01.sec07.ex05;

//Using generics
public class Printer1<T>
{
    public void printArray(T[] array)
    {
        System.out.print("[" + array.length + "]:");
        for(int i = 0; i < array.length-1; i++)
        {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1] + ";");
    }
}
