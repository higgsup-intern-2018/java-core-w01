package com.higgsup.intern.w01.sec07.ex03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {
    private Set<String> myHashSet;

    public MyHashSet(Set<String> mySet) {
        this.myHashSet = mySet;
    }
    /**1. Write a Java program to append the specified element to the end of a hash set.*/
    void append(String str){
        myHashSet.add(str);
    }
    /**2. iterate through all elements in a hash list.*/
    void iterate(){
        Iterator iterator = myHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    /**3. get the number of elements in a hash set.*/
    void getSize(){
        System.out.println(myHashSet.size());
    }

    /**4. empty an hash set and check hash set is empty or not.*/
    void makeEmpty(){
        myHashSet.clear();
    }
    void isEmplty(){
        if (myHashSet.isEmpty()){
            System.out.println("Hash Set is empty!");
        } else System.out.println("Hash Set is not empty!");
    }
    /**5. clone a hash set to another hash set.*/
    void cloneHashSet (Set set){
        for (Object object : myHashSet){
            set.add(object);
        }
    }
    boolean compare(Set set){
       return myHashSet.equals(set);
    }

    /** 10. compare two sets and retain elements which are same on both sets*/

    void compareAndRetainSameElements(HashSet hashSet1, HashSet hashSet2){
        hashSet1.retainAll(hashSet2);
        System.out.println(hashSet1);
    }

    /**remove all of the elements from a hash set.*/
    void remove(){
        myHashSet.clear();
    }
}
