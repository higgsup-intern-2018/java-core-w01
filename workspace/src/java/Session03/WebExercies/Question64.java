package java.Session03.WebExercies;

import java.util.Scanner;

public class Question64 {
    /*
    *   64. Sorting networks. Write a program Sort3.java with three if statements (and no loops) that reads in three integers a, b,
    *  and c from the command line and prints them out in ascending order.
    * */
    public static void main(String[] args) {
        int a ,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a :");
        a=sc.nextInt();
        System.out.println("Input b :");
        b=sc.nextInt();
        System.out.println("Input c :");
        c=sc.nextInt();
        if (a > b) { int t = b; b = a; a = t; }
        if (b > c) { int t = c; c = b; b = t; }
        if (a > c) { int t = c; c = a; a = t; }

        System.out.println(a + " " + b + " " + c);
    }
}
