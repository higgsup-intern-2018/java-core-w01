package com.higgsup.intern.w01.sec03;

public class Exercise09 {
    public static void main(String[] args) {
        int BEGIN = 1000;
        int FINISH = 2000;
        int limit = 5;
        for (int i = BEGIN; i <= FINISH; i++) {
            System.out.print(i + " ");
            if ((i + 1) % limit == 0) {
                System.out.println();
            }
        }
        }
    }
