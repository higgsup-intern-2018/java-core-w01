package session03.web_exercies;

import java.util.Scanner;

public class Question49 {
    /*
    * 49.Write a program Triangle.java that takes a command-line argument N and prints an N-by-N triangular pattern like the one below.
    * */
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n :");
        n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            // in .
            for (int j = 0; j < i; j++)
            {
                System.out.print(". ");
            }
            //in *
            for (int j = 0; j < n - i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
