package com.higgsup.intern.w01.sec04.web;

public class Exercise11
{
    public static void main(String[] args) {
        int w = Integer.parseInt(args[0]);

        int[] weight = {112, 115, 118, 122, 126, 130,
        135, 140, 147, 154, 160, 167, 174, 183, 189, 198, 209, 900};
        String[] weightClass = {
                "Fly Weight",
                "Super Fly Weight",
                "Bantam Weight",
                "Super Bantam Weight",
                "Feather Weight",
                "Super Feather Weight",
                "Light Weight",
                "Super Light Weight",
                "Welter Weight",
                "Super Welter Weight",
                "Middle Weight",
                "Super Middle Weight",
                "Light Heavy Weight",
                "Super Light Heavy Weight",
                "Cruiser Weight",
                "Super Cruiser Weight",
                "Heavy Weight",
                "Super Heavy Weight"};
        for(int i = 0; i < weight.length; i++)
        {
            if(w < weight[i])
            {
                System.out.println(weightClass[i]);
                break;
            }
        }
    }
}
