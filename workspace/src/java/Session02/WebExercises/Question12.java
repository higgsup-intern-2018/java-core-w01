package java.Session02.WebExercises;

import java.util.Scanner;

public class Question12 {
    /*
    *12. Write a program that reads in three parameters and prints true if all three are equal, and false otherwise.
    * Viết 1 chương trình đọc và in ra true nếu 3 số bằng nhau và ngược lại
    * */
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a : ");
        a=sc.nextInt();
        System.out.println("Input b : ");
        b=sc.nextInt();
        System.out.println("Input c : ");
        c=sc.nextInt();
        boolean isA = (a == b && b == c && a==c);
        System.out.println(isA);
    }
}
