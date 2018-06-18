package tranning.java.Session03.Exercies;

import java.util.Scanner;
/*
* 1.Write a program AllEqual.java that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise
* Viết một chương trình AllEqual.java, nhập 3 số là so sánh nếu 3 số đó bằng nhau thì in ra "All equal" và ngược lại
* */
public class Question01 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a :");
        a = sc.nextInt();
        System.out.println("Input b :");
        b=sc.nextInt();
        System.out.println("Input c :");
        c = sc.nextInt();
        if (a==b && b==c)
        {
            System.out.println("All equal.");
        }
        else
        {
            System.out.println("Not equal.");
        }
    }
}
