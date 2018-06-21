package com.higgsup.intern.w01.sec04.web;

public class Exercise3
{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        for (int i = 0; i < n; i++) {
            int j = (int) (Math.random() * (i + 1));
            int swap = array[i];
            array[i] = array[j];
            array[j] = swap;
        }

        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[j] == i) System.out.print("* ");
                else           System.out.print(". ");
            }
            System.out.println("");
        }
    }
}
