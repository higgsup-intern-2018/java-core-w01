package com.higgsup.intern.w01.sec07.ex05;

public class OtherPrinter {
    public static void printIntegerArray(Integer [] integerArray){
        int length = integerArray.length;
        System.out.print("[" + length +"]:");
        for (int i = 0; i < (length-1) ; i++){
            System.out.print(integerArray[i] + ", ");
        }
        System.out.print(integerArray[(length-1)]+ ";");

    }
    public static void printStringArray(String [] stringArray){
        int length = stringArray.length;
        System.out.print("[" + length +"]:");
        for (int i = 0; i < (length-1) ; i++){
            System.out.print(stringArray[i] + ", ");
        }
        System.out.print(stringArray[(length-1)]+ ";");

    }

    public static void printCharArray(Character [] charArray){
        int length = charArray.length;
        System.out.print("[" + length +"]:");
        for (int i = 0; i < (length-1) ; i++){
            System.out.print(charArray[i] + ", ");
        }
        System.out.print(charArray[(length-1)]+ ";");

    }
}
