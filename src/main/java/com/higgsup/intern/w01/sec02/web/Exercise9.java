package com.higgsup.intern.w01.sec02.web;

public class Exercise9
{
    public static void main(String[] args)
    {
        //2 random card of Alice
        int card1 = (int)(Math.random() * 100);
        int card2 = (int)(Math.random() * 100);

        //Assume Bob choose card 1 and see its value
        boolean isTrue = (card1 >= 50);
        System.out.println(isTrue);

        //If isTrue = true => Bob commits to card 1
        //If isTrue = false => Bob commits to card 2
    }
}
