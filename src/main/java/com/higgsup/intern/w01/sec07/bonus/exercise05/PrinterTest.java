package com.higgsup.intern.w01.sec07.bonus.exercise05;

public class PrinterTest {
    public static void main(String[] args) {
        System.out.println(" =============== Print array not use Generics =============== ");
        Printer_NotUseGeneric.printArray();
        System.out.println("\n =============== Print array use Generics =============== ");
        Printer_UseGeneric printer = new Printer_UseGeneric();
        Character[] chars = new Character[]{'1','2','3','2','1','0'};
        Integer[] ints = new Integer[]{1,2,3,2,1,0};
        String[] strings = new String[]{"1","2","3","2","1","0"};
        System.out.print("Character array: ");
        printer.printArray(chars);
        System.out.print("\nInteger array: ");
        printer.printArray(ints);
        System.out.print("\nString array: ");
        printer.printArray(strings);
    }
}
