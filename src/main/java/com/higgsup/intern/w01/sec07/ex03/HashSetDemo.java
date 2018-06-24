package com.higgsup.intern.w01.sec07.ex03;

import java.util.*;

public class HashSetDemo
{
    public static void main(String[] args) {
        Set myHashSet = new HashSet();
        Set clone = new HashSet();
        Set retain = new HashSet();
        MyHashSet demoHashSet = new MyHashSet(myHashSet);

        retain.add("Stewie");
        retain.add("Rain");
        retain.add("fox");
        retain.add("Karrigan");

        //Append specific element
        demoHashSet.append("Xyp9x");
        demoHashSet.append("Stewie");
        demoHashSet.append("Rain");
        demoHashSet.append("Niko");
        demoHashSet.append("device");

        System.out.println(myHashSet);

        //Iterate through all elements
        System.out.print("Iterate elements: ");
        demoHashSet.iterate();

        //Get the numbers of elements in hash set
        System.out.println("Number of elements: " + demoHashSet.numberOfElements());

        //Clone hash set
        demoHashSet.clone(clone);
        System.out.println("Clone hash set: " + clone);

        //Convert hash set to array
        myHashSet.toArray();
        System.out.println("To array: " + myHashSet);

        //Convert hash set to tree set
        Set treeSet = new TreeSet(myHashSet);
        System.out.println("To tree set: " + treeSet);

        //Convert hash set to list
        List list = new ArrayList(myHashSet);
        System.out.println("To list: " + list);

        //Compare two hash set
        System.out.println("Is equal?: " + demoHashSet.compare(clone));

        //Compare and retain
        demoHashSet.compareAndRetain(retain);
        System.out.println("After retain: " + myHashSet);

        //Remove all elements
        demoHashSet.removeAll();

        //Check if hash set is empty
        System.out.println("Is empty: " + demoHashSet.checkEmpty());

        //Empty hash set
        clone.clear();
        System.out.println("After empty: " + clone);
    }
}
