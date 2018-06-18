package com.higgsup.intern.w01.sec03;
//Write a program AllEqual.java that takes three integer command-line arguments and prints equal if all three are equal,
// and not equal otherwise.
public class Exercise01 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        boolean areEqual = (num1 == num2)&&(num1 == num3);
        if (areEqual == true){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
