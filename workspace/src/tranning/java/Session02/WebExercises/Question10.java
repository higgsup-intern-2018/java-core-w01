package tranning.java.Session02.WebExercises;

import java.util.Scanner;

public class Question10 {
    /*
    * 10. Fibonacci word. Write a program FibonacciWord.java that prints the Fibonacci word of order 0 through 10. f(0) = "a", f(1) = "b", f(2) = "ba", f(3) = "bab", f(4) = "babba", and in general f(n) = f(n-1) followed by f(n-2).
    * Use string concatenation.
    * */
    public static String fibWord(int n)
    {
        String n1 ="a";
        String n2 ="b";
        String temp;
        for (int i=2; i<=n; i++)
        {
            temp = n2;
            n2 += n1;
            n1 = temp;
        }
        return n2;
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a :");
        n = sc.nextInt();
        System.out.println(fibWord(n)+"\n");
    }
}
