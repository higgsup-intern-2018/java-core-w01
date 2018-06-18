package com.higgsup.intern.w01.sec03.web;

public class Exercise08 {
    public static void main(String[] args) {
        int windSpeed = Integer.parseInt(args[0]);

        if (windSpeed <  74) {
            System.out.println("Not a hurricane");
        }
        else if (windSpeed <  96){
            System.out.println("Class 1 hurricane");
        }
        else if (windSpeed < 111) {
            System.out.println("Class 2 hurricane");
        }
        else if (windSpeed < 131){
            System.out.println("Class 3 hurricane");
        }
        else if (windSpeed < 155){
            System.out.println("Class 4 hurricane");
        }
        else System.out.println("Class 5 hurricane");
    }
}
