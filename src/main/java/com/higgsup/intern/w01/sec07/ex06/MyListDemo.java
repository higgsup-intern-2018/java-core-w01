package com.higgsup.intern.w01.sec07.ex06;

import java.util.ArrayList;
import java.util.List;

public class MyListDemo
{
    public static void main(String[] args)
    {
        MyList myList = new MyList();
        List<Integer> numbers = new ArrayList<>();
        int[] nums = new int[]{4, 2, 9, 33, 14};
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);

        //set data with list
        myList.setData(numbers);
        myList.print();
        System.out.println();

        //add number
        myList.add(14);
        myList.add(4);
        myList.print();
        System.out.println();

        //add number at index
        myList.add(4, 33);
        myList.add(2, 16);
        myList.print();
        System.out.println();

        //remove index
        myList.removeIndex(3);
        myList.print();
        System.out.println();

        //remove element
        myList.removeElements(14);
        myList.print();
        System.out.println();

        //remove range
        myList.removeRange(2, 9);
        myList.print();
        System.out.println();
        //fill range

        //reverse list
        myList.reverse();
        myList.print();
    }
}
