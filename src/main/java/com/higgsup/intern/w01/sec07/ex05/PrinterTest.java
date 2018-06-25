package com.higgsup.intern.w01.sec07.ex05;

public class PrinterTest
{
    public static void main(String[] args) {
        Printer printer = new Printer();
        int[] nums = new int[]{1, 3, 5, 9, 6, 12, 14, 22, 16, 38};
        char[] ch = new char[]{'b', 'm', 's', 'd', 'f', 'h', 'k', 'l'};
        String[] s = new String[]{"Ropz", "Stew", "tenz", "som"};
        printer.printInt(nums);
        printer.printChar(ch);
        printer.printString(s);
    }
}
