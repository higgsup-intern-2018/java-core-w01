package com.higgsup.intern.w01.sec02.CreativeExercises;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m,d,y;
        System.out.println("Nhập m = ");
        m=sc.nextInt();
        System.out.println("Nhập y = ");
        y=sc.nextInt();
        System.out.println("Nhập d =  ");
        d= sc.nextInt();

        int y0 = y-(14-m)/12;
        int x  = y0+ y0/4 -y0/100 + y0/400;
        int m0 = m+12*((14-m)/12)-2;
        int d0 = (d+x + (31*m0)/12) %7;

        System.out.println("Gía trị của y0 là: "+y0);
        System.out.println("Gía trị của x là: "+x);
        System.out.println("Giá trị của m0 là: "+m0);
        System.out.println("Giá trị của d0 là: "+d0);

    }
}
