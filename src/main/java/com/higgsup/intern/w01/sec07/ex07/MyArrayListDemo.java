package com.higgsup.intern.w01.sec07.ex07;

import java.util.List;

public class MyArrayListDemo
{
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        String[] toArray;

        //add element
        arrayList.add("Lucas");
        arrayList.add("Hwin");
        arrayList.add("Tenz");
        arrayList.add("Ropz");
        arrayList.add("Sunny");
        arrayList.add("Stew");
        arrayList.add("cold");
        arrayList.add("Fallen");
        arrayList.add("nathE");
        arrayList.add("food");
        System.out.print("After add element: ");
        arrayList.print();

        //add element at index
        arrayList.add(4, "oskar");
        arrayList.add(6, "niko");
        System.out.print("After add element at index: ");
        arrayList.print();

        //index check
        System.out.println("Check index 3: " + arrayList.indexCheck(3));

        //get index
        System.out.println("Get element at index 2: " + arrayList.get(2));

        //set element at index
        arrayList.set(0, "som");
        System.out.print("After change element: ");
        arrayList.print();

        //remove element
        arrayList.remove("cold");
        System.out.print("After remove element: ");
        arrayList.print();

        //remove index
        arrayList.remove(5);
        System.out.print("After remove index: ");
        arrayList.print();

        //contains element
        System.out.println("Does list contain Tenz?: " + arrayList.contains("Tenz"));

        //index of element
        System.out.println("Does list contain Belo?: " + arrayList.indexOf("Belo"));

        //toArray
        System.out.print("To array: [");
        for(String s: arrayList.toArray())
        {
            System.out.print(s + " ");
        }
        System.out.println("]");

        //Sublist
        List s = arrayList.subList(0, 2);
        System.out.println("To sublist: " + s);

        //clear element
        arrayList.clear();
        System.out.print("After clear: ");
        arrayList.print();

        //is empty
        System.out.println("Is empty? " + arrayList.isEmpty());
    }
}
