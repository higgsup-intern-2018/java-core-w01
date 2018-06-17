package com.higgsup.intern.w01.sec03;

public class Exercise8
{
    public static void main(String[] args) {
        int numberLines = Integer.parseInt(args[0]);
        String suffix;

        for(int i = 1; i <= numberLines; i++)
        {
            if(i % 100 >= 11 && i % 100 <= 20)
            {
                suffix = "th";
            } else if(i % 10 == 1 && i != 11)
            {
                suffix = "st";
            }else if(i % 10 == 2 && i != 12)
            {
                suffix = "nd";
            }else if(i % 10 == 3 && i != 13)
            {
                suffix = "rd";
            }else {
                suffix = "th";
            }
            System.out.println(i+suffix + " hello.");
        }
    }
}
