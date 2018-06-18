package com.higgsup.intern.w01.sec03;
/*Rewrite TenHellos.java to make a program Hellos.java that takes the number of lines to print as a command-line argument.
        You may assume that the argument is less than 1000. Hint: consider using i % 10 and i % 100 to determine whether
        to use "st", "nd", "rd", or "th" for printing the ith Hello.*/
public class Exercise08 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++){
            System.out.print(i);
            if (i % 100 >= 11 && i % 100 <= 20) { System.out.print("th");
            } else if (i % 10 == 1) System.out.print("st");
              else if (i % 10 == 2) System.out.print("nd");
              else if (i % 10 == 3) System.out.print("rd");
              else {
                System.out.print("th");
            }
            System.out.println(" Hello");
        }
    }
}
