package com.higgsup.intern.w01.sec07.ex02;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyList implements Cloneable
{
    private List<String> myList;

    public MyList(List<String> list)
    {
        myList = list;
    }

    public void add(String s)
    {
        myList.add(s);
    }

    public void print()
    {
        System.out.println(myList.toString());
    }

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

    public void insert(String color)
    {
        myList.add(0, color);
    }

    public void update(int position, String update)
    {
        myList.set(position, update);
    }

    public void retrieve(int index)
    {
        System.out.println(myList.get(index));
    }

    public void removeThird()
    {
        myList.remove(2);
    }

    public boolean searchElement(String color)
    {
        for(String c: myList)
        {
            if(c.equalsIgnoreCase(color))
            {
                return true;
            }
        }
        return false;
    }

    public void sortArray()
    {
        Collections.sort(myList);
    }

    public void copy(List<String> list)
    {
        for(String c : myList)
        {
            list.add(c);
        }
    }

    public void shuffle()
    {
        Collections.shuffle(myList);
    }

    public void reverse()
    {
        Collections.reverse(myList);
    }

    public boolean compare(List<String> list)
    {
        return myList.equals(list);
    }

    public void join(List<String> list)
    {
        myList.addAll(list);
    }

    public void clone(List<String> clone)
    {
       for(String s : myList)
       {
           clone.add(s);
       }
    }

    public void emptyList()
    {
        myList.clear();
    }

    public boolean isEmpty()
    {
        return myList.isEmpty();
    }

    public void printAll()
    {
        for(int i = 0; i < myList.size(); i++)
        {
            System.out.print(myList.get(i) + " ");
        }
    }
}
