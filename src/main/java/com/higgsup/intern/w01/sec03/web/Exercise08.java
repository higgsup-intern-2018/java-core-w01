package com.higgsup.intern.w01.sec03.web;

public class Exercise08 {
    public static void main(String[] args) {
        int windSpeed = Integer.parseInt(args[0]);
        if (windSpeed < 74) System.out.println("It is not a hurricane");
        if (windSpeed >= 74 && windSpeed <= 95) System.out.println("Category 1");
        if (windSpeed >= 96 && windSpeed <= 110) System.out.println("Category 2");
        if (windSpeed >= 111 && windSpeed <= 130) System.out.println("Category 3");
        if (windSpeed >= 131 && windSpeed <= 155) System.out.println("Category 4");
        if (windSpeed >= 156) System.out.println("Category 5");
    }
}
