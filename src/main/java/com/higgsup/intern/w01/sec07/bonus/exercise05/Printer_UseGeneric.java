package com.higgsup.intern.w01.sec07.bonus.exercise05;

public class Printer_UseGeneric<T> {
    public void printArray(T[] array){
        System.out.print("["+array.length+"]: ");
        for (int i = 0; i< array.length; i++){
            if (i< array.length - 1){
                System.out.print(array[i]+", ");
            } else {
                System.out.print(array[i]+"; ");
            }
        }
    }
}
