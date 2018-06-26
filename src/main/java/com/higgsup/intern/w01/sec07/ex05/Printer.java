package com.higgsup.intern.w01.sec07.ex05;

public class Printer {

    public static <T> void printArray(T [] myArray){
        int length = myArray.length;
        System.out.print("[" + length +"]:");
        for (int i = 0; i < (length-1) ; i++){
            System.out.print(myArray[i] + ", ");
        }
        System.out.print(myArray[(length-1)]+ ";");

    }
}
