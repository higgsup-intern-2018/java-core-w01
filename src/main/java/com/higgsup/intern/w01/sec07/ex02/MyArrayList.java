package com.higgsup.intern.w01.sec07.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
    private List<String> myList;


    public MyArrayList(List<String> list) {
        myList = list;
    }

    /**
     * 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
     */
    void addElement(String str){
        myList.add(str);
    }
    void print() {
        System.out.println(myList.toString());
    }

    /**
     * 2. Write a Java program to iterate through all elements in a array list.
     */
    void iterate(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 3. Write a Java program to insert an element into the array list at the first position.
     */
    void insert(String element) {
        myList.add(0, element);
    }

    /**
     * 4. Retrieve an element (at a specified index) from a given array list.
     */
    void retrieve(int index) {
        System.out.println("The element with index = " + index + " is " + myList.get(index));
    }

    /**
     * 5. Update specific array element by given element.
     */
    void update(int position, String element)
    {
        myList.set(position, element);
    }

    /**
     * 6. Remove the third element from a array list.
     */
    void remove() {
        myList.remove(2);
    }

    /**
     * 7. Search an element in a array list.
     */
    void search(int index) {
        System.out.println("The element with index = " + index + " is " + myList.get(index));
    }

    /**
     * 8. Sort a given array list.
     */
    void sort() {
        Collections.sort(myList);
    }

    /**
     * 9. Copy one array list into another.
     */
    void copy(ArrayList newArrayList)
    {
        for (Object arr : myList)
        newArrayList.add(arr);
    }

    /**
     * 10. shuffle elements in a array list.
     */

    void shuffle() {
        Collections.shuffle(myList);
    }

    /**
     * 11. Reverse elements in a array list.
     */

    void reverse() {
        Collections.reverse(myList);
    }

    /**
     * 12. compare two array lists.
     */
    void compare(MyArrayList arrayList) {
        if (myList.equals(arrayList)) {
            System.out.println("The arrays are equal!");
        } else System.out.println("The arrays are not equal!");
    }

    /**
     * 13. join two array lists.
     */
    void join(ArrayList arrayList1, ArrayList arrayList2) {
        arrayList1.addAll(arrayList2);
    }

    /** 14. clone an array list to another array list.
     */
    void cloneArrayList(ArrayList arrayList){
        myList = new ArrayList(arrayList);
    }
    /**
     * 15. empty an array list and check list is empty or not
     */
    void makeEmpty() {
        myList.clear();
    }
    /**16. replace the second element of a ArrayList with the specified element. */

    void replace (String str){
        myList.set(1, str);
    }

    /**17. print all the elements of a ArrayList using the position of the elements. */
    void printAll(){
     int size = myList.size();
     for (int index=0; index < size; index++){
         System.out.println(myList.get(index));
     }
    }
}
