package com.higgsup.intern.w01.sec04;

public class Exercise4
{
    public static void main(String[] args)
    {
        int array[] = {1, 2 ,3, 4, 5};
        for(int i = 0; i < array.length/2 ; i++)
        {
            array[i] = array[i] - array[array.length-1-i];
            array[array.length-i-1] = array[array.length-i-1] + array[i];
            array[i] = array[array.length-i-1] - array[i];
        }
        for(int i: array)
        {
            System.out.println(i);
        }
    }
}
