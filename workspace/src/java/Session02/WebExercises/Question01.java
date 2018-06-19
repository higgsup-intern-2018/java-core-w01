package java.Session02.WebExercises;
import java.util.Scanner;

public class Question01 {
        /*
        * 1. Write a program Swap.java that takes two integer command-line arguments a and b and swaps their values using the swapping idiom described on p. 17.
        * After each assignment statement, use System.out.println() to print a trace of the variables.
        * Viết một chương trình nhận 2 số a và b hoán đổi vị trí của chúng bằng cách sử dụng
        * phép hoán đổi được mô tả trên p.17.Sau mỗi câu lệnh gán, sử dụng System.out.println () để in một dấu vết của các biến.
        * */
    public static void main(String[] args) {
        int a ,b,c = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a :");
        a = sc.nextInt();
        System.out.println("Input number số b :");
        b = sc.nextInt();
        System.out.println("a = "+a +", b = "+b+", c ="+c);
        c = a;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        a = b;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        b = c;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
