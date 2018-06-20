package com.higgsup.intern.w01.sec04.web;

public class Exercise38
{
    public static void main(String[] args)
    {
        int[] rollingDice = new int[5];
        for(int i = 0; i < rollingDice.length; i++)
        {
            int rollDice = (int)(Math.random() * 6) + 1;
            rollingDice[i] = rollDice;
        }

        if(rollingDice[0] == rollingDice[1] && rollingDice[0] == rollingDice[2]
                && rollingDice[0] == rollingDice[3] && rollingDice[0] == rollingDice[4])
        {
            System.out.println("Yahtzee");
        }else
            {
                System.out.println("Try again");
            }
    }
}
