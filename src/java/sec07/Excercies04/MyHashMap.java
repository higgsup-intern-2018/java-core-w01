package sec07.Excercies04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map copy = new HashMap();

        //1.Write a Java program to associate the specified value with the specified key in a HashMap.
        hashMap.put(1, "banana");
        hashMap.put(2, "lemon");
        hashMap.put(3, "apple");
        System.out.println("Hash map: " + hashMap);

        //2.count the number of key-value (size) mappings in a map.
        System.out.println("Size of map: " + hashMap.size());

        //3.copy all of the mappings from the specified map to another map.
        copy.putAll(hashMap);
        System.out.println("Copy hash map: " + copy);

        //4.remove all of the mappings from a map.
        copy.clear();
        System.out.println("After remove all: " + copy);

        //5.check whether a map contains key-value mappings (empty) or not.
        System.out.println("Hash map empty : " + hashMap.isEmpty());
        System.out.println("Copy hash map empty : " + copy.isEmpty());

        //6. test if a map contains a mapping for the specified key.
        System.out.println("Contains mapping for the specified key 1 : " + hashMap.containsKey(1));

        //7.test if a map contains a mapping for the specified value.
        System.out.println("Contains mapping for value banana : " + hashMap.containsValue("banana"));

        //8.create a set view of the mappings contained in a map.
        Set set = hashMap.entrySet();
        System.out.println("Set views: " + set);

        //9. get the value of a specified key in a map.
        System.out.println("Value of key 3 : " + hashMap.get(3));

        //10.get a set view of the keys contained in this map.
        Set anotherSet = hashMap.keySet();
        System.out.println("Key in this map : " + anotherSet);

        //11.get a collection view of the values contained in this map.
        System.out.println("Collection view of values: " + hashMap.values());
    }
}
