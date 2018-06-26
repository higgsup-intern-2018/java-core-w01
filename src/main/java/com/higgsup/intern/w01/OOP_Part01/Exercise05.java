package com.higgsup.intern.w01.oop_part01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("/Users/admin/Desktop/HA_Java/java-core-w01/src/main/java/com/higgsup/intern/w01/OOP_Part01/exercise05.rtf"));
            while (input.hasNext()){
                String str = input.next();
                System.out.println(str);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: "+e);
        }
    }
}
