package com.higgsup.intern.w01.sec07;

// khong dung generic
public class Printer {
    public void printString(String[] array){
        int length = array.length;
        System.out.print("["+length+"] : ");
        for(int i=0 ; i<length-1 ; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[length-1]+";");
    }

    public void printInt(int[] array){
        int length = array.length;
        System.out.print("["+length+"] : ");
        for(int i=0 ; i<length-1 ; i++){
            System.out.println(array[i]+", ");
        }
        System.out.println(array[length-1]+";");
    }

    public void printChar(char[] array){
        int length = array.length;
        System.out.print("["+length+"] : ");
        for(int i=0 ; i<length-1 ; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[length-1]+";");
    }
}
