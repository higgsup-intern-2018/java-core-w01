package com.higgsup.intern.w01.sec03;

public class Exercise13
{
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        while(n != 0)
        {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        //m = 987654321, n = 0
    }
}
