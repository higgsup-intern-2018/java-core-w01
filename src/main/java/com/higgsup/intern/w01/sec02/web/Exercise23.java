package com.higgsup.intern.w01.sec02.web;
//Temperature conversion. What is wrong with the following code fragment to convert from Fahrenheit (F) to Celsius (C)?
public class Exercise23 {
    public static void main(String[] args) {
        double F = 80.5;
        //double C = (F - 32) * (5 / 9); // nếu ta lấy 5/9 thì kết quả sẽ trả về giá trị là 1 số nguyên bằng 0.
        //nên C sẽ = 0.
        double C = ((F - 32) * 5) / 9;
        System.out.println(C);
    }
}
