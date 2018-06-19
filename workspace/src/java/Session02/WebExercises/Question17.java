package java.Session02.WebExercises;

import java.util.Scanner;

public class Question17 {
    /*
    *17. Write a program that takes four real-valued command line parameters x1, y1, x2, and y2 and prints the Euclidean distance between the points (x1, y1) and (x2, y2). Use Math.sqrt().
    * Viết một chương trình lấy 4 tham số , x1,y1,x2,y2 và in ra khoảng cách giữa hai điểm (x1,y1) và (x2,y2) sử dụng Math.sqrt()
    * */
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x1 :");
        x1 = sc.nextInt();
        System.out.println("Input y1 :");
        y1 = sc.nextInt();
        System.out.println("Input x2 :");
        x2 = sc.nextInt();
        System.out.println("Input y2 :");
        y2 = sc.nextInt();
        double distance =  Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        System.out.println("Distance from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") = " + distance);
    }
}
