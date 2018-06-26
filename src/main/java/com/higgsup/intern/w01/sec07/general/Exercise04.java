package com.higgsup.intern.w01.sec07.general;

import java.util.*;

public class Exercise04 {

    //    to iterate through all elements in a map.
    public static void showMap(HashMap hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.printf(iterator.next()+"  ");
        }
    }

//  Count the number of key-value (size) mappings in a map
    public static void sizeOfMap(HashMap hashMap){
        System.out.println("Hashmap has "+hashMap.size()+" key-value pairs");
    }

//    Copy all of the mappings from the specified map to another map
    public static void copyMap(HashMap hashMap){
        HashMap copyMap = new HashMap();
        copyMap.putAll(hashMap);
        System.out.print("List copy content: ");
        showMap(hashMap);
    }

//    remove all of the mappings from a map
public static void removeAllItem(HashMap hashMap){
    HashMap emptyMap = new HashMap();
    emptyMap.putAll(hashMap);
    emptyMap.clear();
    if (emptyMap.size() == 0) System.out.print("List is empty now!");
    else System.out.print("List is not empty now!");
}

//  check whether a map contains key-value mappings (empty) or not
    public static void isMapEmpty(HashMap hashMap){
        if (hashMap.size() == 0) System.out.print("List is empty now!");
        else {
            System.out.print("List is not empty. Content: ");
            showMap(hashMap);

        }
    }

//    test if a map contains a mapping for the specified key
    public static void containKey(HashMap hashMap,Integer key){
        if (hashMap.containsKey(key)) {
            System.out.print("Key '"+key+ "' existed");
        } else {
            System.out.println("Can not find key in hash map");
        }
    }

//    test if a map contains a mapping for the specified value
    public static void containValue(HashMap hashMap,String value){
        if (hashMap.containsValue(value)) {
            System.out.print("Item '"+value+"' existed");
        } else {
            System.out.println("Can not find item");
        }
    }

//    create a set view of the mappings contained in a map
    public static void setViewKey(HashMap hashMap){
        Set<Integer> listKey = new HashSet<>();
        listKey.addAll(hashMap.keySet());
        for (Integer key : listKey){
            System.out.print(key+" ");
        }
    }

//    get a collection view of the values contained in this map
    public static void collectionViewMap(HashMap hashMap){
        for (Object item :hashMap.values()){
            System.out.print(item+" ");
        }
    }

    public static void setViewMapping(HashMap hashMap){
        Set set = hashMap.entrySet();
        System.out.print(set);
        }

    public static void detailValueOfKey(HashMap hashMap,Integer key){
        if (hashMap.containsKey(key)) {
            System.out.print("The item you find with key "+key+" has value: "+ hashMap.get(key));
        } else {
            System.out.println("Can not find value with key: "+key);
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> flowers = new HashMap<>();
        flowers.put(0,"Rose");
        flowers.put(1,"Elder");
        flowers.put(2,"Lilac");
        flowers.put(3,"Forget_me_not");
        flowers.put(4,"Lotus");
        flowers.put(5,"Chrysanthemum");
        System.out.print("\n\n 2.Count the number of key-value (size) mappings in a map: ");
        sizeOfMap(flowers);
        System.out.println("\n\n 3.Copy all of the mappings from the specified map to another map: ");
        copyMap(flowers);
        System.out.print("\n\n 4.Remove all of the mappings from a map: ");
        removeAllItem(flowers);
        System.out.println("\n\n 5.Check whether a map contains key-value mappings (empty) or not: ");
        isMapEmpty(flowers);
        System.out.print("\n\n 6.Test if a map contains a mapping for the specified key: ");
        containKey(flowers,3);
        System.out.print("\n\n 7.Test if a map contains a mapping for the specified value: ");
        containValue(flowers,"Lotus");
        System.out.print("\n\n 8.Create a set view of the mappings contained in a map: ");
        setViewMapping(flowers);
        System.out.print("\n\n 9.Get the value of a specified key in a map: ");
        detailValueOfKey(flowers,4);
        System.out.print("\n\n 10.Get a set view of the keys contained in this map: ");
        setViewKey(flowers);
        System.out.print("\n\n 11.Get a collection view of the values contained in this map: ");
        collectionViewMap(flowers);

    }
}
