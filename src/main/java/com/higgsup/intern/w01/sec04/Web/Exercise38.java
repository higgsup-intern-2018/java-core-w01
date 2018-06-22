package com.higgsup.intern.w01.sec04.Web;

import java.util.Random;

public class Exercise38 {
    public static void main(String[] args) {
        int [] a = new int[5];
        Random random = new Random();
        for(int i = 0; i< a.length ; i++){
            a[i] = random.nextInt(6);
        }
        if(a[0] == a[1] && a[0] == a[2] && a[0]== a[3] && a[0]==a[4] &&a[0] == a[5] ){
            System.out.println("Yahtzee");
        }else {
            System.out.println("Try again");
        }


    }
}
