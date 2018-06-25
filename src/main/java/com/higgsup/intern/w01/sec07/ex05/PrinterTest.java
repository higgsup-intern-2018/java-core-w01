package com.higgsup.intern.w01.sec07.ex05;

public class PrinterTest
{
    public static void main(String[] args) {
        Printer printer = new Printer();
        int[] nums = new int[]{1, 3, 5, 9, 6, 12, 14, 22, 16, 38};
        char[] ch = new char[]{'b', 'm', 's', 'd', 'f', 'h', 'k', 'l'};
        String[] s = new String[]{"Ropz", "Stew", "tenz", "som"};

        Integer[] numbers = new Integer[]{1, 3, 5, 9, 6, 12, 14, 22, 16, 38};
        Character[] characters = new Character[]{'b', 'm', 's', 'd', 'f', 'h', 'k', 'l'};

        System.out.println("Not using generics: ");
        printer.printInt(nums);
        printer.printChar(ch);
        printer.printString(s);

        System.out.println("Using generics: ");
        Printer1<String> printer1 = new Printer1<>();
        printer1.printArray(s);
        Printer1<Integer> integerPrinter1 = new Printer1<>();
        integerPrinter1.printArray(numbers);
        Printer1<Character> characterPrinter1 = new Printer1<>();
        characterPrinter1.printArray(characters);
    }
}
