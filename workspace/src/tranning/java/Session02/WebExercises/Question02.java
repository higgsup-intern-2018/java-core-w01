package tranning.java.Session02.WebExercises;

import java.util.Scanner;

public class Question02 {
    /*
    * 2.What does the following statement do where grade is a variable of type int?
    *     boolean isA = (90 <= grade <= 100);
    * */
    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input grade :");
        grade=sc.nextInt();
        // boolean isA = (90 <= grade <= 100);-- Chương trình sẽ báo lỗi cú pháp vì <= là toán tử nhị phân
        boolean isA = (90 <= grade && grade<= 100);
        System.out.println(isA);
    }
}
