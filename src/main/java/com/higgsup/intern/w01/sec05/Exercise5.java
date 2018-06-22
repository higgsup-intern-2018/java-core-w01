package com.higgsup.intern.w01.sec05;

import java.io.File;
import java.util.Scanner;

public class Exercise5
{
    public static void main(String[] args) {
        try {

            Scanner input = new Scanner (new File("D:\\challenge.txt"));

            while(input.hasNextLine())
            {
                String s = input.next();
                System.out.println(s);
            }
        } catch (java.io.FileNotFoundException e) {}
    }
}
