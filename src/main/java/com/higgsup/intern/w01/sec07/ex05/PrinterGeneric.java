package com.higgsup.intern.w01.sec07.ex05;

// dung Generic
public class PrinterGeneric<T> {
    public
    void printArray(T[] array){
        int length = array.length;
        System.out.print("["+length+"] : ");
        for(int i=0 ; i<length-1 ; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[length-1]+";");
    }
}
