package com.higgsup.intern.w01.sec07.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map copyMap = new HashMap();

        //Associated specified value with specified key
        hashMap.put(1, "Blue");
        hashMap.put(2, "Green");
        hashMap.put(3, "Yellow");
        System.out.println("Hash map: " + hashMap);

        //count the numbers
        System.out.println("Size of mappings: " + hashMap.size());

        //copy all of the mappings
        copyMap.putAll(hashMap);
        System.out.println("Copied hash map: " + copyMap);

        //remove all the mappings
        copyMap.clear();
        System.out.println("After remove all: " + copyMap);

        //check whether a map is empty or not
        System.out.println("Is hash map empty?: " + hashMap.isEmpty());
        System.out.println("Is copied hash map empty?: " + copyMap.isEmpty());

        //test if a map contains a mapping for specified key
        System.out.println("Contains mapping for key 1?: " + hashMap.containsKey(1));
        System.out.println("Contains mapping for key 4?: " + hashMap.containsKey(4));

        //test if a map contains a mapping for specified value
        System.out.println("Contains mapping for value red?: " + hashMap.containsValue("Red"));
        System.out.println("Contains mapping for value blue?: " + hashMap.containsValue("Blue"));

        //create a set view of the mappings contained in a map
        Set set = hashMap.entrySet();
        System.out.println("Set views: " + set);

        //Get the value of specified key in a map
        System.out.println("Value of key 2: " + hashMap.get(2));

        //get a set view of the keys contained in this map
        Set anotherSet = hashMap.keySet();
        System.out.println("Key in this map: " + anotherSet);

        //Collection view of values contained in this map
        System.out.println("Collection view of values: " + hashMap.values());
    }
}
