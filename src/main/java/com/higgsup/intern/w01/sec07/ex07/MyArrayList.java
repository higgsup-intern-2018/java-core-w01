package com.higgsup.intern.w01.sec07.ex07;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList
{
    private int size;
    private int capacity;
    private String[] strings;
    private static final int CAPACITY = 10;

    //no-args constructor
    public MyArrayList()
    {
        capacity = CAPACITY;
        strings = new String[capacity];
    }

    //constructor with array length
    public MyArrayList(int capacity)
    {
        this.capacity = capacity;
        strings = new String[capacity];
    }

    //check index
    public boolean indexCheck(int index) throws IndexOutOfBoundsException
    {
        if(index > size || index < 0)
        {
            throw new IndexOutOfBoundsException("Out of index " + index);
        }
        else {
            return true;
        }
    }

    //get index
    public String get(int index)
    {
        if(indexCheck(index))
        {
            return strings[index];
        }else{
            return "Not found";
        }
    }

    //add elements to list
    public void add(String element)
    {
        size += 1;
        checkAddCapacity();
        strings[size-1] = element;
    }

    //add element at index
    public void add(int index, String element)
    {
        if(indexCheck(index))
        {
            size += 1;
            checkAddCapacity();
            for(int i = size - 1; i > index; i--)
            {
                strings[i] = strings[i-1];
            }
            strings[index] = element;
        }else{
            System.out.println("Index not found");
        }
    }

    //update element at index
    public void set(int index, String element)
    {
        if(indexCheck(index))
        {
            strings[index] = element;
        }else {
            System.out.println("Index not found");
        }
    }

    //remove element
    public void remove(String element)
    {
        for(int i = 0; i < size; i++)
        {
            if(strings[i].equalsIgnoreCase(element))
            {
                remove(i);
            }
        }
    }

    //remove at index
    public void remove(int index)
    {
        size -= 1;
        for(int i = index; i < size; i++)
        {
            strings[i] = strings[i+1];
        }
    }

    //clear
    public void clear()
    {
        String[] arr = new String[capacity];
        strings = arr;
        size = 0;
    }

    //isEmpty
    public boolean isEmpty()
    {
       return size == 0;
    }

    //contains element
    public boolean contains(String element)
    {
        for(int i = 0; i < size; i++) {
            if (strings[i].equalsIgnoreCase(element)) {
                return true;
            }
        }
        return false;
    }

    //index of element
    public int indexOf(String element)
    {
        for(int i = 0; i < size; i++) {
            if (strings[i].equalsIgnoreCase(element)) {
                return i;
            }
        }
        return -1;
    }

    //to array
    public String[] toArray()
    {
        String[] s = new String[size];
        for(int i = 0; i < size; i++)
        {
            s[i] = strings[i];
        }
        return s;
    }

    //sublist
    public List subList(int fromIndex, int toIndex)
    {
        List list = new ArrayList();
        if(indexCheck(fromIndex) && indexCheck(toIndex))
        {
            for(int i = fromIndex; i <= toIndex; i++)
            {
                list.add(strings[i]);
            }
        }
        return list;
    }


    public void print()
    {
        if(size > 0) {
            System.out.print("[");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(strings[i] + " ");
            }
            System.out.println(strings[size - 1] + "]");
        }else
            {
                System.out.println("[]");
            }
    }

    public int size(){
        return size;
    }

    public void checkAddCapacity()
    {
        if(size == capacity)
        {
            addCapacity();
        }
    }

    public void addCapacity()
    {
        capacity *= 1.5;
        String[] newArray = new String[capacity];
        for(int i = 0; i < size; i++)
        {
            newArray[i] = strings[i];
        }
        strings = newArray;
    }
}
