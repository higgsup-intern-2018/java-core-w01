package com.higgsup.intern.w01.sec07.ex07;

import java.util.List;

public class MyArrayListDemo
{
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();

        //add element
        arrayList.add("Lucas");
        arrayList.add("Hwin");

        //add at index
        arrayList.add(1, "Tenz");
        arrayList.add("food");

        arrayList.print();

        //index check
        System.out.println(arrayList.indexCheck(3));

        //get index
        System.out.println("Get element at index 2: " + arrayList.get(2));

        //set element at index
        arrayList.set(0, "som");
        arrayList.print();

        //remove element
        arrayList.print();

        //contains element
        System.out.println(arrayList.contains("Tenz"));

        //index of element
        System.out.println(arrayList.indexOf("Tenz"));

        //Sublist
        List s = arrayList.subList(0, 2);
        System.out.println(s);
    }
}
