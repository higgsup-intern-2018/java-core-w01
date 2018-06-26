package com.higgsup.intern.w01.sec07.ex02;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListDemo
{
    public static void main(String[] args)
    {
        List myList = new ArrayList();
        MyArrayList list = new MyArrayList(myList);
        List copied = new ArrayList<>();
        List clone = new ArrayList<>();
        MyArrayList anotherList = new MyArrayList(copied);

        //Add and print out collection
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.print();

        //Iterate through all element
        list.iterate();

        //retrieve element at a given index
        System.out.print("Retrieve element at index 1: ");
        list.retrieve(1);

        //Insert element at first position
        list.insert("Purple");
        System.out.print("After insert at first position: ");
        list.print();

        //Update specific array element by given element
        list.update(2, "Black");
        System.out.print("After update specific element by given element: ");
        list.print();

        //remove the third element from a array list
        list.removeThird();
        System.out.print("After remove third element: ");
        list.print();

        //search an element in an array list
        System.out.println("Is purple in array list?: " + list.searchElement("purple"));
        System.out.println("Is black in array list?: " + list.searchElement("black"));

        //Sort a given array list
        list.sortArray();
        System.out.print("After sort: ");
        list.print();

        //Copy one array list into another
        list.copy(copied);
        System.out.print("Original list: ");
        list.print();
        System.out.println("Copied list: " + copied);

        //Shuffle elements in array list
        list.shuffle();
        System.out.print("After shuffle: ");
        list.print();

        //Reverse elements in array list
        list.reverse();
        System.out.print("After reverse at first position: ");
        list.print();

        //Compare two array list
        System.out.println("Is two array list equals?: " + list.compare(copied));

        //Join two array list
        list.join(copied);
        System.out.print("After join: ");
        list.print();

        //Clone an array list to another array list
        list.clone(clone);
        System.out.print("Clone list: " + clone.toString());
        System.out.println();

        //replace second element with specified element
        list.replaceSecond("Sea");
        System.out.print("After replace: ");
        list.print();

        //print all element using position of elements
        System.out.print("Print all elements: ");
        list.printAll();

        //Empty an array list
        list.emptyList();
        System.out.print("After empty: ");
        list.print();

        //Check list is empty or not
        System.out.println("Is array list empty?: " + list.isEmpty());


    }
}
