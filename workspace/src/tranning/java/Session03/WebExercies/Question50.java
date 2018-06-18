package tranning.java.Session03.WebExercies;

import java.util.Scanner;

public class Question50 {
    /*
    * 50.Write a program Ex.java that takes a command-line argument N and prints a (2N + 1)-by-(2N + 1) ex like the one below.
    * Use two for loops and one if-else statement.
    * */
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n :");
        n=sc.nextInt();
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if ((i == -j) || (i == j))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
