package com.higgsup.intern.w01.sec04.web;

public class Exercise03 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i;
            int random= (int) (Math.random() * (i+1));
            int temp = a[random];
            a[random] = a[i];
            a[i] = temp;
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == i) System.out.print("Q ");
                else           System.out.print(". ");
            }
            System.out.println("");
        }
    }
}
