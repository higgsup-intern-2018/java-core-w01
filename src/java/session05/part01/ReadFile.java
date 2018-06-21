package session05.part01;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try
        {
            File file = new File("D:\\intern-training\\java-core-w01\\src\\java\\session05\\part01\\input.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext())
            {
                String next = sc.nextLine();
                String[] arr = next.split(" ");
                for (String word:arr) {
                    System.out.println(word);
                }
            }
        }
        catch (java.io.FileNotFoundException e)
        {

        }
    }
}
