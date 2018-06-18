package com.higgsup.intern.w01.sec03;

public class Exercise13 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m=0;
        while(n != 0 ){
            m=(10*m) + (n%10);
            n = n/10;
        }
        System.out.println(m);

    }
}
