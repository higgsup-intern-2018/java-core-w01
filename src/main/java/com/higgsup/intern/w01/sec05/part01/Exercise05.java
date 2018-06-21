package com.higgsup.intern.w01.sec05.part01;

import java.io.File;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("E:\\Higgsup\\java-core-w01\\src\\main\\java\\com\\higgsup\\intern\\w01\\sec05\\part01\\test.txt"));
            while (input.hasNext()){
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (java.io.FileNotFoundException e) {}
    }
}
