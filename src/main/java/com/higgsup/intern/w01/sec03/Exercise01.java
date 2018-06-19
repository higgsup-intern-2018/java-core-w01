package com.higgsup.intern.w01.sec03;
import java.util.*;
public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhập a= ");
        a= sc.nextInt();
        System.out.println("Nhập b=");
        b=sc.nextInt();
        System.out.println("Nhập c= ");
        c=sc.nextInt();

        if(a==b && a==c){
            System.out.println("Tất cả bằng nhau");
        }else{
            System.out.println("Tất cả không bằng nhau");
        }
    }
}
