package com.higgsup.intern.w01.sec03.web;

//Change/add one character so that the following program prints 20 xs. There are two different solutions.
public class Exercise10 {
    public static void main(String[] args) {
        int i = 0, n = 20;
        for (i = 0; -i < n; i--)      //i-- thành n-- hoặc i<n thành -i<n
            System.out.print(" x");
    }
}
