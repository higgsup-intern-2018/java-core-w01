package session02.web_exercises;

import java.util.Scanner;

public class Question18 {
    /*
    * 18 . Write a program Ordered.java that reads in three integer command line arguments, x, y, and z.
    * Create a boolean variable b that is true if the three values are either in ascending or in descending order,
    * and false otherwise. Print the variable b.
    * - Viết một chương trình Ordered.java đọc 3 đối số ,x,y và z. Tạo một biến boolean b trả về true
    * nếu x,y,z có thứ tự là tăng dần hoặc giảm dần, và ngược lại. In biến b
    * */
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x :");
        x=sc.nextInt();
        System.out.println("Input y :");
        y=sc.nextInt();
        System.out.println("Input z :");
        z=sc.nextInt();
        boolean b = (x>y && y>z || x<y && y<z);
        System.out.println(b);
    }
}
