package com.higgsup.intern.w01.sec07.ex03;

import java.util.*;

public class MyHashSetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        Set hashSetClone = new HashSet();
        Set hashSet1 = new HashSet();
        hashSet1.add("Min");
        hashSet1.add("Titus");
        hashSet1.add("Dustin");
        MyHashSet myHashSetClone = new MyHashSet(hashSetClone);
        MyHashSet myHashSet = new MyHashSet(hashSet);

        //append the specified element to the end of a hash set
        myHashSet.append("Titus");
        myHashSet.append("Dustin");
        myHashSet.append("Henry");

        //iterate through all elements in a hash list
        myHashSet.iterate();

        //get the number of elements in a hash set.
        myHashSet.getSize();

        //clone hash set
        myHashSet.cloneHashSet(hashSetClone);
        myHashSetClone.iterate();

        //empty an hash set and check hash set is empty or not.
        myHashSetClone.makeEmpty();
        myHashSetClone.isEmplty();

        //convert a hash set to an array.
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);
        System.out.print("Array elements: ");
        System.out.println(Arrays.toString(array));

        //convert a hash set to a tree set.
        Set<String> treeSetset = new TreeSet<String>(hashSet);
        // Displaying TreeSet elements
        System.out.println("TreeSet contains: ");
        for(String temp : treeSetset){
            System.out.println(temp);
        }
        //convert a hash set to a List/ArrayList
        List<String> list = new ArrayList<String>(hashSet);
        System.out.println("ArrayList contains: "+ list);

        // compare two hash set.
        System.out.println("Are two hash set equal? :" + myHashSet.compare(hashSetClone));

        //compare two sets and retain elements which are same on both sets
        myHashSet.compareAndRetainSameElements((HashSet)hashSet, (HashSet)hashSet1);

        //remove all of the elements from a hash set.
        myHashSetClone.remove();
        myHashSetClone.isEmplty();

    }
}
