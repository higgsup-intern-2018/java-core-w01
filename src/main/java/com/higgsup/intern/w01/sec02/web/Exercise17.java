package com.higgsup.intern.w01.sec02.web;

//Write a program that takes four real-valued command line parameters x1, y1, x2, and y2
// and prints the Euclidean distance
// between the points (x1, y1) and (x2, y2). Use Math.sqrt().
public class Exercise17 {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        double distance = Math.sqrt(x2*x2 + y2*y2) - Math.sqrt(x1*x1 + x1*x1);
        System.out.printf("The distance between the points (%d, %d) and (%d, %d): %f ", x1, y1, x2, y2, distance);
    }
}
