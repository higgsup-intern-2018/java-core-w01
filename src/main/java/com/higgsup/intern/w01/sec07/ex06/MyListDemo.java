package com.higgsup.intern.w01.sec07.ex06;

import java.util.ArrayList;
import java.util.List;

public class MyListDemo
{
    public static void main(String[] args)
    {
        MyList myList = new MyList();
        List<Integer> numbers = new ArrayList<>();
        int[] nums = new int[]{1, 2, 9, 33, 14};
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);

        //set data with list
        myList.setData(numbers);
        System.out.print("Set data with list: ");
        myList.print();

        //set data with array
        //myList.setData(nums);


        //add number
        myList.add(14);
        myList.add(4);
        System.out.print("List after add new numbers: ");
        myList.print3();

        //add number at index
        myList.add(4, 25);
        myList.add(2, 16);
        System.out.print("If add at index out of bound: ");
        myList.add(14, 12);
        System.out.print("List after add new numbers at index: ");
        myList.print();

        //add list
        myList.add(nums);
        System.out.print("List after add array: ");
        myList.print();

        //remove index
        myList.removeIndex(3);
        System.out.print("List after remove number at index: ");
        myList.print2();

        System.out.print("If remove at index out of bound: ");
        myList.removeIndex(14);

        //remove element
        myList.removeElements(14);
        System.out.print("List after remove number at index: ");
        myList.print3();

        //remove range
        myList.removeRange(2, 9);
        System.out.print("List after remove numbers in range: ");
        myList.print();

        //sort list
        myList.sort();
        System.out.print("List after sort: ");
        myList.print2();

        //fill range


        //reverse list
        myList.reverse();
        System.out.print("List after reverse: ");
        myList.print();

        //another reverse list
        myList.reverse2();
        System.out.print("List after another reverse: ");
        myList.print2();
    }
}
