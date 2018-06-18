package com.higgsup.intern.w01.sec03;

public class Exercise13 {
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.printf("m = %d, n = %d", m, n); //Kết quả: m = 987654321, n = 0
    }
}
/*Giải thích: n = 123456789 khác 0, nên m = 9, n = 12345678
            n = 12345678 khác 0, nên m = 10*9 + 8 = 98, n = 1234567
            n = 1234567 khác 0, nên m = 10*98 + 7 = 987, n = 123456
tương tự đến n=0 thì dừng lại*/