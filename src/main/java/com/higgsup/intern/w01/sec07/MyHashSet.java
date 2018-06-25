/* Write a Java program to append the specified element to the end of a hash set.

Write a Java program to iterate through all elements in a hash list.

Write a Java program to get the number of elements in a hash set.

Write a Java program to empty an hash set and check hash set is empty or not.

Write a Java program to clone a hash set to another hash set.

Write a Java program to convert a hash set to an array.

Write a Java program to convert a hash set to a tree set.

Write a Java program to convert a hash set to a List/ArrayList.

Write a Java program to compare two hash set.

Write a Java program to compare two sets and retain elements which are same on both sets.

Write a Java program to remove all of the elements from a hash set. */
package com.higgsup.intern.w01.sec07;

import java.util.Iterator;
import java.util.Set;

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