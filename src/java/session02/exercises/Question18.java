package session02.exercises;

import java.util.Scanner;

public class Question18 {
    /*
     * 18 .Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
     *Viết một chương trình Distance.java nhận 2 số kiểu integer x và y. Sau đó in ra khoảng cách
     * từ điểm (x,y) đếm điểm (0,)
     **/

    public static void main(String[]args)
    {
        int x,y;
        Scanner sc = new Scanner(System.in);// dùng scanner để nhập dữ liệu từ bàn phím
        System.out.println("Input number x : ");
        x = sc.nextInt();
        System.out.println("Input number  y :");
        y=sc.nextInt();
        double dist = Math.sqrt(x*x+y*y);
        System.out.println("Distance from (" + x + "," + y + ") to (0,0) = " + dist);
    }
}
