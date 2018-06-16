package com.higgsup.intern.w01.sec02.web;

public class Exercise05 {
    public static void main(String[] args) {

        double x = (double) (3/5);
        System.out.println(x);
        //Kết quả sẽ in ra là 0.0
        //Khi 3/5, trình biên dịch sẽ hiểu là phép tính chia của 2 số kiểu int, nên kết quả sẽ là kiểu int là 0.
        //Sau đó casting về double thì kết quả là 0.0
        // double x = (3.0/5); sẽ kết quả đúng 0.6

    }
}
