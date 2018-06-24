package com.higgsup.intern.w01.sec07.ex03;

import java.util.*;

public class MyHashSet
{
    private Set<String> hashSet;

    public MyHashSet(Set hashSet)
    {
        this.hashSet = hashSet;
    }

    //append element to the end of hash set
    public void append(String s)
    {
        hashSet.add(s);
    }

    //Iterate through all elements in a hash set
    public void iterate()
    {
        Iterator<String> it = hashSet.iterator();
        while(it.hasNext())
        {
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
    }

    //Get number of elements in hashSet
    public int numberOfElements()
    {
        return hashSet.size();
    }

    //Empty hashSet
    public void empty()
    {
        hashSet.clear();
    }

    //Check if hashSet is empty
    public boolean checkEmpty()
    {
        return hashSet.isEmpty();
    }

    //Clone a hash set
    public void clone(Set clone)
    {
        for(Object o : hashSet)
            clone.add(o);
    }


    //Compare two hash set
    public boolean compare(Set s)
    {
        return hashSet.equals(s);
    }

    //Compare two sets and retain elements which are same on both sets.
    public void compareAndRetain(Set anotherSet)
    {
        hashSet.retainAll(anotherSet);
    }

    public void removeAll()
    {

    }
}
