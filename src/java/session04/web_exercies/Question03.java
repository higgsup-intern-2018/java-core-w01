package session04.web_exercies;

import java.util.Scanner;
/*
* Random permutation. Write a program Permutation.java so that it takes a
* command-line argument N and prints a random permutation of the integers 0 through N-1.
 * Also print a checkerboard visualization of the permutation.
 * As an example, the permutation { 4, 1, 3, 0, 2 } corresponds to:
        4 1 3 0 2
        * * * Q *
        * Q * * *
        * * * * Q
        * * Q * *
        Q * * * *
* */
public class Question03 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng : ");
        n=sc.nextInt();
        int[] a = new int[n];
        //insert các số <n vào mảng a
        for (int i = 0; i < n; i++)
        {
            a[i] = i;
        }
        //đảo vị trí của các phần tử trong mảng a
        for (int i = 0; i < n; i++)
        {
            int x = (int) (Math.random() * (i+1));
            int y = a[x];
            a[x] = a[i];
            a[i] = y;
        }

        //in ra hoán vị ở trên
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");

        }
        System.out.println("");
       /*
       * in ra
            4 1 3 0 2
            * * * Q *
            * Q * * *
            * * * * Q
            * * Q * *
            Q * * * *
       * */
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[j] == i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(". ");
                }
            }
            System.out.println("");
        }
    }
}
