package com.higgsup.intern.w01.sec02.web;

public class Exercise17 {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);

        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        int x = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double distance = Math.sqrt(x);
        System.out.println("Distance from point ("+x1+","+y1+") to point ("+x2+","+y2+") = "+distance);
    }
}
