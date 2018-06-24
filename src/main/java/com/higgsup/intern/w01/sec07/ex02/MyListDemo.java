package com.higgsup.intern.w01.sec07.ex02;

import java.util.ArrayList;
import java.util.List;

public class MyListDemo
{
    public static void main(String[] args)
    {
        List myList = new ArrayList();
        MyList list = new MyList(myList);
        List copied = new ArrayList<>();
        List clone = new ArrayList<>();
        MyList anotherList = new MyList(copied);

        //Add and print out collection
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.print();

        //Iterate through all element
        list.iterate();

        //retrieve element at a given index
        list.retrieve(1);

        //Insert element at first position
        list.insert("Purple");
        list.print();


        //Update specific array element by given element
        list.update(2, "Black");
        list.print();

        //remove the third element from a array list
        list.removeThird();
        list.print();

        //search an element in an array list
        System.out.println(list.searchElement("purple"));
        System.out.println(list.searchElement("black"));

        //Sort a given array list
        list.sortArray();
        list.print();

        //Copy one array list into another
        list.copy(copied);
        System.out.print("Original list: ");
        list.print();
        System.out.println("Copied list: " + copied);

        //Shuffle elements in array list
        list.shuffle();
        list.print();

        //Reverse elements in array list
        list.reverse();
        list.print();

        //Compare two array list
        System.out.println(list.compare(copied));

        //Join two array list
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
