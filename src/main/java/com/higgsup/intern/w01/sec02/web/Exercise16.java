package com.higgsup.intern.w01.sec02.web;

public class Exercise16
{
    public static void main(String[] args) {
        int threeInt = 3;
        int fourInt = 4;
        double threeDouble = 3.0;
        double fourDouble = 4.0;

        System.out.println(threeInt / fourInt);         //print 0
        System.out.println(threeInt / fourDouble);      //print 0.75
        System.out.println(threeDouble / fourInt);      //print 0.75
        System.out.println(threeDouble / fourDouble);   //print 0.75
    }
}
