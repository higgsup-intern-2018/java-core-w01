package com.higgsup.intern.w01.sec04;

public class Exercise14 {
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int a[][] = new int[n][n];
    for(int i=0 ; i<n ; i++){
        for(int j=0 ; j< n ; j++){
            a[i][j] = n*i + j;
        }
    }

        System.out.println("Before");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j< n ; j++){
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        System.out.println("After");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ;j++){
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
    }
}
