package com.higgsup.intern.w01.sec07.ex05;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int[] number = new    int[]   {1,2,3,4,5,6};
        char[] ch    = new   char[]   {'a', 'b', 'c', 'd', 'e', 'f'};
        String[] str = new String[]   {"Bale", "Ronaldo", "Messi", "NeyMar", "Suarez","Matic"};

        System.out.println("Không dùng generic");
         printer.printInt(number);
         printer.printChar(ch);
         printer.printString(str);


        System.out.println("Có dùng Generic");
        PrinterGeneric<String> pg = new PrinterGeneric<>();
        pg.printArray(str);

        Character[] characters    = new   Character[]   {'a', 'b', 'c', 'd', 'e', 'f'};
        PrinterGeneric IntergerPG = new PrinterGeneric();
        IntergerPG.printArray(characters);

        String[] strings = new String[]   {"Bale", "Ronaldo", "Messi", "NeyMar", "Suarez","Matic"};
        PrinterGeneric StringPG = new PrinterGeneric();
        StringPG.printArray(strings);

    }
}
