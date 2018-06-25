package com.higgsup.intern.w01.sec07;

import java.util.ArrayList;
import java.util.List;

public class DemoAllList {
    public static void main(String[] args) {
        List allList = new ArrayList<>();

        AllList list = new AllList(allList);

        List copied = new ArrayList();
        List clone  = new ArrayList();
        AllList anotherList = new AllList(copied);

        list.add("Violet");
        list.add("Red");
        list.add("Blue");
        list.print();

        // Iterate
        list.iterate();

        //retrieve
        list.retrieve(2);

        //Insert
        list.insert("White");
        list.print();

        // update

        list.update(3,"Orange");
        list.print();

        //remove the third
        list.removeThird();
        list.print();

        //Search element
        System.out.println(list.searchElement("Blue"));
        System.out.println(list.searchElement("Violet"));

        //Sort
        list.sortArray();
        list.print();

        //Copy one array into another

        list.copy(copied);
        System.out.println("Original list:");
        list.print();
        System.out.println("Copied list: "+copied);

        // Shuffle elements

        list.shuffle();
        list.print();

        //Reverse

        list.reverse();
        list.print();

        //Compare 2 mang
        System.out.println(list.compare(copied));

        // Join 2 mang

        list.join(copied);
        list.print();

        //Clone an array list to another array list
        list.clone(clone);
        System.out.print("Clone list: " + clone.toString());
        System.out.println();

        //Empty an array list
        list.emptyList();
        list.print();

        //Check list is empty or not
        System.out.println(list.isEmpty());
        System.out.println(anotherList.isEmpty());

        //print all element using position of elements
        anotherList.printAll();
    }
}
