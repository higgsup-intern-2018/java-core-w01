package com.higgsup.intern.w01.sec03.web;

//Write a program that takes five integer command-line arguments and prints the median (the third largest one).
public class Exercise03 {
    public static void main(String[] args) {
     String tempt;

        for (int i = 0; i < args.length - 1; i++){
            for(int j = i + 1 ; j< args.length; j++){
                if (Integer.parseInt(args[i]) > Integer.parseInt(args[j])){
                    tempt = args[i];
                    args[i] = args[j];
                    args[j] = tempt;
                }
            }
        }
        System.out.println("The median: " + args[2]);
    }
}
