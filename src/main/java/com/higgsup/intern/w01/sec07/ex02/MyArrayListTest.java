package com.higgsup.intern.w01.sec07.ex02;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {

    public static void main(String[] args) {
        List colors = new ArrayList();
        MyArrayList myArrayList = new MyArrayList(colors);

        //1. add some colors
        colors.add("white");
        colors.add("black");
        colors.add("red");

        //1. print collection
        myArrayList.print();

        //2. print all elements in a array list.
        myArrayList.iterate(colors);

        //3. insert an element into the array list at the first position.
        myArrayList.insert("pink");
        myArrayList.print();

        //4.retrieve an element (at a specified index) from a given array list.
        myArrayList.retrieve(0);

        //5. update specific array element by given element.
        myArrayList.update("blue");
        myArrayList.print();

        //6. remove the third element from a array list.
        myArrayList.remove();
        myArrayList.print();

        //7. search an element in a array list.
        myArrayList.search(1);

        //8. sort a given array list.
        myArrayList.sort();
        System.out.println("Array List after sorting:");
        myArrayList.print();

        //9. copy one array list into another.
        ArrayList listOfColors = new ArrayList();
        MyArrayList myArrayList1 = new MyArrayList(listOfColors);
        System.out.println("After copying colors to listOfColors: ");
        myArrayList1.copy(listOfColors);
        myArrayList1.print();

        //10. shuffle elements in a array list.
        System.out.println("After shuffling elements:");
        myArrayList.shuffle();
        myArrayList.print();

        //11. reverse elements in a array list.
        System.out.println("After reversing elements in colors: ");
        myArrayList.reverse();
        myArrayList.print();

        //12. compare two array lists.
        ArrayList otherListOfColors = new ArrayList();
        otherListOfColors.add("grey");
        otherListOfColors.add("green");

        MyArrayList myArrayList2 = new MyArrayList(otherListOfColors);
        myArrayList1.compare(myArrayList2);

        //13. join two array lists.
        System.out.println("After joining colors and otherListOfColors: ");
        myArrayList.join((ArrayList) colors, otherListOfColors);
        myArrayList.print();

        //15. Empty an array list and check list is empty or not
        System.out.println("Empty an array list");
        myArrayList2.makeEmpty();
        myArrayList2.print();
        System.out.println(otherListOfColors.isEmpty());

        //16. replace the second element of a ArrayList with the specified element.
        myArrayList.replace("orange");
        myArrayList.print();

        //17. print all the elements of a ArrayList using the position of the elements.
        myArrayList.printAll();
    }
}

