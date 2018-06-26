package com.higgsup.intern.w01.sec07.ex05;


public class PrinterTest {
    public static void main(String[] args) {
        Character[] characterArray = {'T', 'I', 'T', 'U', 'S', 'E'};
        Integer[] integerArray = {1, 2, 3, 4, 5, 6 };
        String [] stringArray = {"Nike", "Adidas", "Reebok", "Lining", "Gucci", "Zara"};

        // Answer: Method called "printArray" should be marked "static". So, we can call it from its class without initializing a Object.
        Printer.printArray(characterArray);
        System.out.println();
        Printer.printArray(integerArray);
        System.out.println();
        Printer.printArray(stringArray);
        System.out.println();

        //Non Generics:
        OtherPrinter.printCharArray(characterArray);
        System.out.println();
        OtherPrinter.printIntegerArray(integerArray);
        System.out.println();
        OtherPrinter.printStringArray(stringArray);


    }
}
