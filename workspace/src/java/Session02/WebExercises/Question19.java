package java.Session02.WebExercises;

import java.util.Scanner;

/*
* 19. Write a program Divisibility.java that reads in two command line inputs and prints true if both are divisible by 7, and false otherwise.
* */
public class Question19  {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x :");
        x = sc.nextInt();
        System.out.println("Input y :");
        y=sc.nextInt();
        boolean isDivisible = ((x%7==0)&&(y%7==0));
        System.out.println(isDivisible);

    }
}
