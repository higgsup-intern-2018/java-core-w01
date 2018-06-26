package com.higgsup.intern.w01.sec07.ex06;

import java.util.*;

public class MyList
{
    private List<Integer> numbers;

    public MyList(){
        numbers = new ArrayList<>();
    }

    //setData with list
    public void setData(List<Integer> numbers)
    {
        this.numbers = numbers;
    }

    //setData with array
    public void setData(int[] numbers)
    {
    }

    //sort
    public void sort()
    {
        Collections.sort(numbers);
    }

    //add element
    public void add(int number)
    {
        numbers.add(number);
    }

    //add element with index
    public void add(int index, int number)
    {
        if(index < numbers.size()-1) {
            numbers.add(index, number);
        }else{
            System.out.println("Out of bound");
        }
    }

    //add list
    public void add(int[] numbers)
    {
        for(int n: numbers)
        {
            this.numbers.add(n);
        }
    }

    //remove at index
    public void removeIndex(int index)
    {
        if(index < numbers.size()-1) {
            numbers.remove(index);
        }else {
            System.out.println("Out of bound");
        }
    }

    //remove element
    public void removeElements(int element)
    {
        Integer e = element;
        numbers.remove(e);
    }

    //remove range
    public void removeRange(int from, int to)
    {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            int x = iterator.next();
            if(from <= x && x <= to)
            {
                iterator.remove();
            }
        }
    }

    //fill range
    public void fillRange(int from, int to)
    {
        for(int i = 0; i < numbers.size(); i++)
        {

        }
    }

    //reverse list
    public void reverse()
    {
        Collections.reverse(numbers);
    }

    public void reverse2()
    {
        List<Integer> list = new ArrayList<>();
        for(int i = numbers.size()-1; i > -1; i--)
        {
            list.add(numbers.get(i));
        }
        numbers = list;
    }

    public void print()
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }

    public void print2()
    {
        for(Integer x: numbers)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void print3()
    {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            int x = iterator.next();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
