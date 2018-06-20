package com.higgsup.intern.w01.sec03.web;

public class Exercise55 {
    public static void main(String[] args) {
        int day   = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        switch (month){
            case 3:
                if(day>20){
                    System.out.println("Season: Spring");

                }else{
                    System.out.println("Season: Winter");
                }
                break;

            case 4:
            case 5:
                System.out.println("Season: Spring");
                break;

            case 6:
                if(day<21){
                    System.out.println("Season: Spring");
                }else{
                    System.out.println("Summer");
                }break;
            case 7:
            case 8:
                System.out.println("Season: Summer");
                break;
            case 9:
                if(day <23){
                    System.out.println("Season: Summer");
                }else{
                    System.out.println("Season: Fall");
                }
            case 10:
            case 11:
                System.out.println("Season: Fall");
                break;
            case 12:
                if(day<21){
                    System.out.println("Season: Fall");
                }else {
                    System.out.println("Season: Winter");
                }
                break;
            case 1:
            case 2:
                System.out.println("Season: Winter");
                break;





        }
    }
}
