package com.higgsup.intern.w01.sec03.web;

public class Exercise7
{
    public static void main(String[] args) {
        int N = 8;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            sum = sum + i;
        }
        System.out.println(sum);

        //sum define inside loop => outside loop cannot access and sum will be initialized to 0 again.
    }
}
