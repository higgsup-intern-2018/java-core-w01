package com.higgsup.intern.w01.sec02;

public class Exercise23 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean isSpring = false;
        if((m ==3 && d >= 20 && d <= 31 )
           ||(m ==4 && d >= 1 && d <= 30 )
           ||(m ==5 && d >= 1 && d <= 31 )
           ||(m ==6 && d >= 1 && d <= 20 )){
            isSpring = true;
        } else isSpring = false;
        System.out.println(isSpring);
    }
}
