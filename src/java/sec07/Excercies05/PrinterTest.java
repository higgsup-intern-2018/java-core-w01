package sec07.Excercies05;

public class PrinterTest {
    public static void main(String[] args) {
        Printer pr = new Printer();
        int[] number = new int[]{1,5,7,3,9,10,45,34,54};
        char[] chars = new char[]{'q','w','t','h','d','s'};
        String[] str = new String[]{"David","Anna","Kim"};
        Integer[] numbers = new Integer[]{4, 3, 6, 5, 1, 12, 14, 22, 16, 38};
        Character[] characters = new Character[]{'q', 'r', 's', 'd', 'w', 'h', 't', 'g'};
        System.out.println("Not using generics: ");
        pr.printInt(number);
        pr.printChar(chars);
        pr.printString(str);
        System.out.println("Using generics: ");
        PrinterArray<String> printer1 = new PrinterArray<>();
        printer1.printArray(str);
        PrinterArray<Integer> integerPrinter1 = new PrinterArray<>();
        integerPrinter1.printArray(numbers);
        PrinterArray<Character> characterPrinter1 = new PrinterArray<>();
        characterPrinter1.printArray(characters);
    }
}
