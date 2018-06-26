package com.higgsup.intern.w01.sec07.ex02;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayList
{
    private List<String> myList;

    public MyArrayList(List<String> list)
    {
        myList = list;
    }

    //add element
    public void add(String s)
    {
        myList.add(s);
    }

    //print list
    public void print()
    {
        System.out.println(myList.toString());
    }

    //iterate through all element
    public void iterate()
    {
        System.out.print("Iterate: ");
        Iterator<String> it = myList.iterator();
        while(it.hasNext())
        {
            String color = it.next();
            System.out.print(color + " ");
        }
        System.out.println();
    }

    //insert element to array list at first position
    public void insert(String color)
    {
        myList.add(0, color);
    }

    //retrieve element at given index
    public void retrieve(int index)
    {
        System.out.println(myList.get(index));
    }

    //update specific array element by given element.
    public void update(int position, String update)
    {
        myList.set(position, update);
    }

    //remove the third element from a array list.
    public void removeThird()
    {
        myList.remove(2);
    }

    //search an element in a array list.
    public boolean searchElement(String color)
    {
        return myList.contains(color);
    }

    //sort array list
    public void sortArray()
    {
        Collections.sort(myList);
    }

    //copy one array list to another
    public void copy(List list)
    {
        Collections.copy(myList, list);
    }

    //shuffle elements in array list
    public void shuffle()
    {
        Collections.shuffle(myList);
    }

    //reverse elements in array list
    public void reverse()
    {
        Collections.reverse(myList);
    }

    //compare two array list
    public boolean compare(List list)
    {
        return myList.equals(list);
    }

    //join two array list
    public void join(List list)
    {
        myList.addAll(list);
    }

    //clone array list to another array list
    public void clone(List clone)
    {
       clone.addAll(myList);
    }

    //empty array list
    public void emptyList()
    {
        myList.clear();
    }

    //check if array list is empty or not
    public boolean isEmpty()
    {
        return myList.isEmpty();
    }

    //replace second elements with specified element
    public void replaceSecond(String elements)
    {
        update(1, elements);
    }

    //print all elements using the positions
    public void printAll()
    {
        for(int i = 0; i < myList.size(); i++)
        {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
