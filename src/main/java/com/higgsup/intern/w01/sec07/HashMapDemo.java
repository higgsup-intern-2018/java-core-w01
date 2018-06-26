/*Write a Java program to associate the specified value with the specified key in a HashMap.

Write a Java program to count the number of key-value (size) mappings in a map.

Write a Java program to copy all of the mappings from the specified map to another map.

Write a Java program to remove all of the mappings from a map.

Write a Java program to check whether a map contains key-value mappings (empty) or not.

Write a Java program to test if a map contains a mapping for the specified key.

Write a Java program to test if a map contains a mapping for the specified value.

Write a Java program to create a set view of the mappings contained in a map.

Write a Java program to get the value of a specified key in a map.

Write a Java program to get a set view of the keys contained in this map.

Write a Java program to get a collection view of the values contained in this map.*/

package com.higgsup.intern.w01.sec07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map copyMap = new HashMap();

        hashMap.put(2 , "Green");
        hashMap.put(3,  "Red");
        hashMap.put(4,  "Cobal");
        hashMap.put(5,  "Orange");
        System.out.println("HashMap: "+hashMap);

        //count the number of key-value (size) mappings in a map.
        System.out.println("Size of mapping: "+hashMap.size());

        // copy all of the mappings from the specified map to another map.

        copyMap.putAll(hashMap);
        System.out.println("Copy hashMap:"+copyMap);

        // remove all of the mappings from a map.
        copyMap.clear();
        System.out.println("Sau khi remove tat ca: "+copyMap);

        // Kiem tra map co rong hay ko

        System.out.println("Map co rong hay ko"+hashMap.isEmpty());
        System.out.println("HashMap copy co rong hay ko"+copyMap.isEmpty());

        //Write a Java program to test if a map contains a mapping for the specified key.

        System.out.println("Kiểm tra map có key là 3:"+hashMap.containsValue(3));
        System.out.println("Kiểm tra map có key là 5:"+hashMap.containsValue(5));

        //test if a map contains a mapping for the specified value.

        System.out.println("Có chưa mapping có giá trị đỏ hay ko?"+hashMap.containsValue("Red"));
        System.out.println("Có chưa mapping có giá trị xanh hay ko?"+hashMap.containsValue("White"));

       //create a set view of the mappings contained in a map.

        Set set = hashMap.entrySet();
        System.out.println("Set views: "+set);

        //get the value of a specified key in a map.

        System.out.println("Gia tri cua key 1: "+hashMap.get(1));

        //get a set view of the keys contained in this map.
        Set key_Set = hashMap.keySet();
        System.out.println(" Key trong map: "+key_Set);

        // get a collection view of the values contained in this map
        System.out.println("Collection view of the value: "+hashMap.values());
    }
}
