package com.higgsup.intern.w01.sec07.bonus.exercise05;

public class Printer_NotUseGeneric {
    public static void printArray(){
        char[] chars = new char[]{'1','2','3','2','1','0'};
        System.out.print("char array: ["+chars.length+"]: ");
        for (int i = 0; i< chars.length; i++){
            if (i< chars.length - 1){
                System.out.print(chars[i]+", ");
            } else {
                System.out.print(chars[i]+"; ");
            }
        }
        int[] ints = new int[]{1,2,3,2,1,0};
        System.out.print("\nint array: ["+ints.length+"]: ");
        for (int i = 0; i< ints.length; i++){
            if (i< ints.length - 1){
                System.out.print(ints[i]+", ");
            } else {
                System.out.print(ints[i]+"; ");
            }
        }
        String[] strings = new String[]{"1","2","3","2","1","0"};
        System.out.print("\nString array: ["+strings.length+"]: ");
        for (int i = 0; i< strings.length; i++){
            if (i< strings.length - 1){
                System.out.print(strings[i]+", ");
            } else {
                System.out.print(strings[i]+"; ");
            }
        }
    }
}
