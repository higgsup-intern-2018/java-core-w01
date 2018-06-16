package com.higgsup.intern.w01.sec02.web;

public class Exercise17
{
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("Euclidean distance between the points (x1, y1) and (x2, y2): " + distance);
    }
}
