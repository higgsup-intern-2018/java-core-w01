package com.higgsup.intern.w01.sec07.ex06;

import java.util.ArrayList;
import java.util.List;

public class MyListDemo
{
    public static void main(String[] args)
    {
        MyList myList = new MyList();
        List<Integer> numbers = new ArrayList<>();
        int[] nums = new int[]{1, 2, 9, 33, 18};
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(12);
        numbers.add(13);

        //set data with list
        myList.setData(numbers);
        System.out.print("Set data with list: ");
        myList.print();

        //set data with array
        myList.setData(nums);

        //add number
        myList.add(6);
        myList.add(7);
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

        //sort list
        myList.sort();
        System.out.print("List after sort: ");
        myList.print2();

        //remove index
        myList.removeIndex(3);
        System.out.print("List after remove number at index: ");
        myList.print2();

        System.out.print("If remove at index out of bound: ");
        myList.removeIndex(14);

        //remove element
        myList.removeElements(14);
        System.out.print("List after remove number elements: ");
        myList.print3();

        //remove range
        myList.removeRange(2, 9);
        System.out.print("List after remove numbers in range: ");
        myList.print2();

        //another remove range
        myList.removeRange2(10, 17);
        System.out.print("List after another remove numbers in range: ");
        myList.print();

        //fill range
        myList.fillRange(17, 25);
        System.out.print("List after fill range: ");
        myList.print();

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
