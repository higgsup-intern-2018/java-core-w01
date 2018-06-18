package com.higgsup.intern.w01.sec03;
//Write a program FivePerLine.java that, using one for loop and one if statement, prints the integers from 1000 to 2000
// with five integers per line. Hint: use the % operator.
public class Exercise09 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++){
            System.out.print(i + " ");
            if ((i + 1) % 5 == 0){
                System.out.println();
            }
        }
    }
}
