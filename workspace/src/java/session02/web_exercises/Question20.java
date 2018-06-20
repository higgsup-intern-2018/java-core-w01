package session02.web_exercises;

import java.util.Scanner;

/*
*  20 .Area of a triangle. Write a program TriangleArea.java that takes three command line inputs a, b, and c, representing the side lengths of a triangle,
 * and prints the area of the triangle using Heron's formula: area = sqrt(s(s-a)(s-b)(s-c)), where s = (a + b + c) / 2.
* */
public class Question20 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a :");
        a =sc.nextInt();
        System.out.println("Input b :");
        b =sc.nextInt();
        System.out.println("Input c :");
        c =sc.nextInt();
        int s = ((a+b+c)/2);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Triangle area : "+area);
    }
}
