package com.higgsup.intern.w01.sec02;

public class Exercise18 {
    public static void main(String[] args) {
       /* Write a program that takes two integer command-line arguments x and y and
        prints the Euclidean distance from the point (x, y) to the origin (0, 0).*/
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    double distance = Math.sqrt(x*x + y*y);
        System.out.printf("Distance from the point (%d, %d) to the origin (0, 0): %f", x, y, distance);
    }
}
