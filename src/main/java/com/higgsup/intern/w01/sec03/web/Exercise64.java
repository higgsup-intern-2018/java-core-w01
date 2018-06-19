package com.higgsup.intern.w01.sec03.web;

public class Exercise64 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);
        int c = Integer.parseInt(args [2]);

        if(b < a){
            int t=b ; b=a ; a=t;
        }if(c<b){
            int t=c; c=b; b=t;
        }if(b<a){
            int t=b;b=a ; a=t;
        }
        System.out.println(a+""+b+""+c);
    }
}
