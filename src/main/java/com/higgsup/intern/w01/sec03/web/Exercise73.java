package com.higgsup.intern.w01.sec03.web;

public class Exercise73 {
    public static void main(String[] args) {

        for (int x = 0; x < 100; x += 0.5) {
            System.out.println(x); //In ra vòng lặp vô cực 0 do x += 0.5 tương đương với x = (int) x + 0.5
        }
    }
}
