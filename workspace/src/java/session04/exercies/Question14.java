package session04.exercies;

import java.util.Scanner;

public class Question14 {
    /*
    * 14.Write a code fragment Transpose.java to transpose a square two-dimensional array in place without creating a second array.
    *Viết một chương trình Transpose.java để di chuyển 1 mảng 2 chiều vuông tại chỗ mà không cần tạo mảng thứ hai
    *
    * */
    static void transpose()
    {
        int n ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input n :"); // nhập số dãy và cột của mảng
        n =sc.nextInt();
        //tảo mảng 2 chiều
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n*i + j;
            }
        }
        // In ra mảng ban đầu
        System.out.println("Before");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        //Sắp xếp mảng sử dụng thuật toán bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
       //In ra mảng sau khi sắp xếp
        System.out.println("After");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        transpose();
    }
}
