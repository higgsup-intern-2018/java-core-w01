package com.higgsup.intern.w01.sec03.web;

public class Exercise50
{
    public static void main(String[] args)
    {
        int line = Integer.parseInt(args[0]);
        for(int i = 2*line+1; i > 0; i--)
        {
           for(int j = 0; j < 2*line+1; j++)
           {
               if(i + j == 2*line+1 || i - j == 1)
               {
                   System.out.print("* ");
               }
               else{
                   System.out.print(". ");
               }
           }
            System.out.println();
        }
    }
}
