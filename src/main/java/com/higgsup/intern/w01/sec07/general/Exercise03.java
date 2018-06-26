package com.higgsup.intern.w01.sec07.general;

import java.util.*;

public class Exercise03 {

//    append the specified element to the end of a hash set
    public static void appendItem(Set set){

    }

    //    to iterate through all elements in a set.
    public static void iterateList(Set set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.printf(iterator.next()+"  ");
        }
    }

//    get the number of elements in a hash set.
    public static void getNumberitem(Set set){
        System.out.print("List has "+set.size()+" elements.");
    }

//    Empty an hash set and check hash set is empty or not
    public static void emptyList(Set set){
        Set emptyList = new HashSet();
        emptyList.addAll(set);
        emptyList.clear();
        if(emptyList.size() == 0){
            System.out.print("List is empty now");
        } else{
            System.out.print("List is not empty now");
            iterateList(set);
        }
    }

//    Clone a hash set to another hash set
    public static void cloneList(Set set){
        Set cloneList = new HashSet();
        cloneList.addAll(set);
        System.out.print("List clone contains: ");
        iterateList(cloneList);
    }

//    Convert a hash set to an array
    public static void convertToArray(Set set){
        Set convertArray = new HashSet();
        convertArray.addAll(set);
        Object[] array = convertArray.toArray();
        System.out.print(" List after convert to array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

//    Convert a hash set to a tree set
    public static void convertToTreeSet(Set set){
        Set treeSet = new TreeSet(set);
        System.out.print(" List after convert to tree set: ");
       iterateList(treeSet);
    }

//    Convert a hash set to a List/ArrayList
    public static void convertToList(Set set){
        List arrayList = new ArrayList(set);
        System.out.print(" List after convert to array list: ");
        for (Object item : arrayList){
            System.out.print(item+" ");
        }
    }
//    Compare two hash set
    public static void compareSet(Set set1, Set set2){
        if(set1.containsAll(set2) && set2.containsAll(set1)){
            System.out.print("2 set equal");
        } else {
            System.out.print("2 set not equal");
        }
    }

//    Compare two sets and retain elements which are same on both sets
    public static void retainSameElements(Set set1, Set set2){
        Set retainSet = new HashSet();
        retainSet.addAll(set1);
        retainSet.retainAll(set2);
        System.out.print("The same element: ");
        iterateList(retainSet);
    }

//    Remove all of the elements
    public static void removeAllElement(Set set1){
        set1.clear();
        System.out.println("Remove all element success!");
    }
    public static void main(String[] args) {
        Set<String> listFruit = new HashSet<String>();
        listFruit.add("Apple");
        listFruit.add("Banana");
        listFruit.add("Papaya");
        listFruit.add("Pineaple");
        listFruit.add("Durian");
        listFruit.add("Litchi");
        listFruit.add("Watermelon");
        listFruit.add("Cucumber");
        listFruit.add("Coconut");

        Set<String> listFood = new HashSet<String>();
        listFood.add("Steak");
        listFood.add("Noodle");
        listFood.add("Sandwich");
        listFood.add("Watermelon");
        listFood.add("Cucumber");
        listFood.add("Coconut");

        System.out.println("\n\n 2.Iterate through all elements in a hash set: ");
        iterateList(listFruit);
        System.out.println("\n\n 3.Get the number of elements in a hash set: ");
        getNumberitem(listFruit);
        System.out.println("\n\n 4.Empty an hash set and check hash set is empty or not: ");
        emptyList(listFruit);
        System.out.println("\n\n 5.Clone a hash set to another hash set: ");
        cloneList(listFruit);
        System.out.println("\n\n 6.Convert a hash set to an array: ");
        convertToArray(listFruit);
        System.out.println("\n\n 7.Convert a hash set to a tree set: ");
        convertToTreeSet(listFruit);
        System.out.println("\n\n 8.Convert a hash set to a List/ArrayList: ");
        convertToList(listFruit);
        System.out.print("\n\n 9.Compare two hash set: ");
        compareSet(listFood,listFruit);
        System.out.println("\n\n 10.Compare two sets and retain elements which are same on both sets: ");
        retainSameElements(listFruit,listFood);
        System.out.print("\n\n 11.Remove all of the elements from a hash set: ");
        removeAllElement(listFood);
    }
}
