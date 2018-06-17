package com.higgsup.intern.w01.sec02.web;

public class Exercise16 {
    public static void main(String[] args) {
        int threeInt = 3;
        int fourInt = 4;
        double threeDouble = 3.0;
        double fourDouble = 4.0;
        System.out.println(threeInt / fourInt); //In ra kết quả: 0, do lấy giá trị nguyên của 3/4
        System.out.println(threeInt / fourDouble); //In ra kết quả: 0.75, ta lấy số int chia cho số double, nên kết quả sẽ là double.
        System.out.println(threeDouble / fourInt); //In ra kết quả: 0.75, ta lấy số double chia cho số int, nên kết quả sẽ là double
        System.out.println(threeDouble / fourDouble); //In ra kết quả: 0.75, ta lấy số double chia cho số double, nên kết quả sẽ là double
    }


}
