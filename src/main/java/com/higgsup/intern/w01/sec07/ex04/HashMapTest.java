package com.higgsup.intern.w01.sec07.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        Map myHashMpap = new HashMap();
        myHashMpap.put(1, "Nike");
        myHashMpap.put(2, "Reebok");
        myHashMpap.put(3, "Adidas");
        myHashMpap.put(4, "Lining");

        //2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("Count the number of key-value: " + myHashMpap.size());

        //3. Write a Java program to copy all of the mappings from the specified map to another map.
        Map secondHashMap = new HashMap();
        secondHashMap.putAll(myHashMpap);
        System.out.println("Second Map: " + secondHashMap);

        //4. Write a Java program to remove all of the mappings from a map.
        secondHashMap.clear();
        System.out.println("Successful remove all of the mappings from a map");

        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("Is secondHashMap empty ? :" + secondHashMap.isEmpty());
        System.out.println("Is myHashMap empty ? :" + myHashMpap.isEmpty());


        //6. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("Does myHashMap contain a mapping for the key = 1: " + myHashMpap.containsKey(1));

        //7. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("Does myHashMap contain a mapping for the value = Reebok: " + myHashMpap.containsValue("Reebok"));

        //8. Write a Java program to create a set view of the mappings contained in a map.
        Set viewOfMapping = myHashMpap.entrySet();
        System.out.println("Set value: "+ viewOfMapping);

        //9. Write a Java program to get the value of a specified key in a map.
        System.out.println("Value of key = 2: " + myHashMpap.get(2));

        //10. Write a Java program to get a set view of the keys contained in this map.
        Set viewOfKeys = myHashMpap.keySet();
        System.out.println("Set view of the keys: " + viewOfKeys);

        //11. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("Collection view of the values : " +  myHashMpap.values());



    }
}
