package com.higgsup.intern.w01.sec07.ex07;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList
{
    private int size;
    private int capacity;
    private String[] strings;
    private static final int CAPACITY = 10;

    public MyArrayList()
    {
        strings = new String[CAPACITY];
    }


    public MyArrayList(int capacity)
    {
        this.capacity = capacity;
        strings = new String[capacity];
    }


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

    public String get(int index)
    {
        if(indexCheck(index))
        {
            return strings[index];
        }else{
            return "Not found";
        }
    }

    public void add(String element)
    {
        size += 1;
        if(size == capacity)
        {
            capacity *= 1.5;
        }
        strings[size-1] = element;
    }

    public void add(int index, String element)
    {
        if(indexCheck(index))
        {
            size += 1;
            if(size == capacity)
            {
                capacity *= 1.5;
            }
            for(int i = size - 1; i > index; i--)
            {
                strings[i] = strings[i-1];
            }
            strings[index] = element;
        }else{
            System.out.println("Index not found");
        }
    }

    public void set(int index, String element)
    {
        if(indexCheck(index))
        {
            strings[index] = element;
        }else {
            System.out.println("Index not found");
        }
    }

    public void remove(String element)
    {
        for(int i = 0; i < strings.length; i++)
        {
            if(strings[i].equalsIgnoreCase(element))
            {
                for(int j = i; j < strings.length-2; j++)
                {
                    strings[j] = strings[j+1];
                }
            }
        }
        strings[strings.length - 1] = null;
    }

    public void remove(int index)
    {
        if(indexCheck(index)) {
            for (int i = 0; i < strings.length; i++) {
                if (i == index) {
                    for (int j = i; j < strings.length; j++) {
                        strings[j] = strings[j + 1];
                    }
                }
            }
            strings[strings.length - 1] = null;
        }else{
            System.out.println("Index not found");
        }
    }

    public void clear()
    {

    }

    public boolean isEmpty()
    {
       return size == 0;
    }

    public boolean contains(String element)
    {
        for(int i = 0; i < strings.length; i++) {
            if (strings[i].equalsIgnoreCase(element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String element)
    {
        for(int i = 0; i < strings.length; i++) {
            if (strings[i].equalsIgnoreCase(element)) {
                return i;
            }
        }
        return -1;
    }

    public String[] toArray()
    {
        String[] s = new String[size];
        for(int i = 0; i < size; i++)
        {
            s[i] = strings[i];
        }
        return s;
    }

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

    public int size(){
        return size;
    }

    public void print()
    {
        System.out.print("[");
        for(int i = 0; i < size - 1; i++)
        {
            System.out.print(strings[i] + " ");
        }
        System.out.println(strings[size - 1] + "]");
    }
}
