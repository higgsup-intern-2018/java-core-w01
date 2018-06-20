package com.higgsup.intern.w01.sec04.web;

/*Random permutation. Write a program Permutation.java so that it takes a command-line argument N and prints a random
permutation of the integers 0 through N-1. Also print a checkerboard visualization of the permutation.
As an example, the permutation { 4, 1, 3, 0, 2 } corresponds to:*/
public class Exercise03 {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int[] myArray = new int[length];

        for (int i = 0; i < length; i++) {
            myArray[i] = i;
        }

        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * (i+1));
            int swap = myArray[random];
            myArray[random] = myArray[i];
            myArray[i] = swap;
        }

        // print permutation
        for (int i = 0; i < length; i++)
            System.out.print(myArray[i] + " ");
        System.out.println("");

        // print checkerboard visualization
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (myArray[j] == i) System.out.print("Q ");
                else           System.out.print(". ");
            }
            System.out.println("");
        }
    }
}
