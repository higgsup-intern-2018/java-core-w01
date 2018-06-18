package com.higgsup.intern.w01.sec02.web;

public class Exercise16 {
    public static void main(String[] args) {
        int threeInt = 3;
        int fourInt  = 4;
        double threeDouble = 3.0;
        double fourDouble  = 4.0;
        System.out.println(threeInt / fourInt);         //int value, this calculator get integrant part
        System.out.println(threeInt / fourDouble);      //double value because have fourDouble
        System.out.println(threeDouble / fourInt);      //double value because have threeDouble
        System.out.println(threeDouble / fourDouble);   //double value because have both threeDouble and fourDouble
    }
}
