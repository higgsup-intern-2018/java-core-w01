package com.higgsup.intern.w01.sec07.bonus.exercise06;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(9);
        numbers.add(73);
        numbers.add(4);
        numbers.add(10);
        numbers.add(0);
        numbers.add(6);
        myList.setData(numbers);
        System.out.print("\nList afer sort: "); myList.sort(numbers);

        myList.add(15);
        myList.add(4,39);
        System.out.print("\nList after add item: ");
        myList.foreach();

        myList.removeIndex(12);
        myList.removeElement(12);
        System.out.print("\nList after remove :");
        myList.foreach();

        myList.removeRange(3,5);
        System.out.print("\nList after remove range:");
        myList.fori();                          
    }
}
