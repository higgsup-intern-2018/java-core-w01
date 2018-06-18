package com.higgsup.intern.w01.sec03;
import java.util.*;
public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhập giá trị n: ");
        n=sc.nextInt();

        for(int i=0 ; i<=n ; i++){
            System.out.print(i);
            if(i%100 >= 11 && i%100 <= 20){
                System.out.println("th");
            }
            else if (i%10 ==1){
                System.out.println("st");
            }else if(i%10 ==2){
                System.out.println("nd");
            }else if(i%10 == 3){
                System.out.println("rd");
            }else{
                System.out.println("th");

            }
        }


    }
}
