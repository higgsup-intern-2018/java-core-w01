package java.Session03.WebExercies;

import java.util.Scanner;

public class Question43 {
    /*
    * 43.What is the value of s after executing the following code?
        int M = 987654321;
        String s = "";
        while (M != 0) {
        int digit = M % 10;
        s = s + digit;
        M = M / 10;
    }
    * */
    public static void main(String[] args) {
        int n ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input n :");
        n=sc.nextInt();
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
        String s = "";
        while (m != 0) {
            int digit = m % 10;
            s = s + digit;
            m = m / 10;
        }
        System.out.println(s);// giá trị của s in ra sẽ bằng giá trị nhập ban đầu
    }
}
