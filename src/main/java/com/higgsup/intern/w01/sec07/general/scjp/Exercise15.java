package com.higgsup.intern.w01.sec07.general.scjp;

import java.util.TreeSet;

 class Dog {
    int size;
    Dog(int s) {
        size = s;
    }
}

public class Exercise15{
     public static void main(String[] args) {
         TreeSet<Integer> i = new TreeSet<Integer>();
         TreeSet<Dog> d = new TreeSet<Dog>();
         d.add(new Dog(1));   d.add(new Dog(2));   d.add(new Dog(1));
         i.add(1);            i.add(2);            i.add(1);
         System.out.println(d.size() + " " + i.size());
     }

        /*     What is the result?
        A. 12
        B. 22
        C. 23
        D. 32
        E. 33
        F. Compilation fails
        G. An exception is thrown at runtime */

//     Choose G vì chưa có phương thức nào so sánh object
}
