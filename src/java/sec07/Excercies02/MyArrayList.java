package sec07.Excercies02;

import java.util.*;

public class MyArrayList {
    private List<String> myList;
    public MyArrayList(List<String> list) {
        myList = list;
    }

    /*
     * 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
     */
    void add(String str){
        myList.add(str);
    }
    void printList() {
        System.out.println(myList.toString());
    }

    /*
     * 2. Write a Java program to iterate through all elements in a array list.
     */
    void iterate() {
        System.out.print("Iterate: ");
        Iterator<String> it = myList.iterator();
        while(it.hasNext())
        {
            String color = it.next();
            System.out.print(color + " ,");
        }
    }

    /*
     * 3. Write a Java program to insert an element into the array list at the first position.
     */
    void insert(String element) {
        myList.add(0, element);
    }

    /*
     * 4. Retrieve an element (at a specified index) from a given array list.
     */
    void retrieve(int index) {
        System.out.println("The element with index = " + index + " is " + myList.get(index));
    }

    /*
     * 5. Write a Java program to update specific array element by given element.
     */
    void update(int position, String element)
    {
        myList.set(position, element);
    }

    /*
     * 6. Write a Java program to remove the third element from a array list.
     */
    void remove() {
        myList.remove(2);
    }

    /*
     * 7. Write a Java program to search an element in a array list.
     */
    boolean search(String color) {
        for(Object object: myList)
        {
            if(object.toString().equalsIgnoreCase(color))
            {
                return true;
            }
        }
        return false;
    }

    /*
     * 8. Write a Java program to sort a given array list.
     */
    void sort() {
        Collections.sort(myList);
    }

    /*
     * 9. Write a Java program to copy one array list into another.
     */
    void copy(List list)
    {
        for (Object arr : myList)
        {
            list.add(arr);
        }
    }

    /*
     * 10. Write a Java program to reverse elements in a array list.
     */

    void shuffle() {
        Collections.shuffle(myList);
    }

    /*
     * 11.Write a Java program to reverse elements in a array list.
     */

    void reverse() {
        Collections.reverse(myList);
    }

    /*
     * 12. Write a Java program to compare two array lists.
     */
    boolean compare(List list) {
        return myList.equals(list);
    }

    /*
     * 13. Write a Java program to join two array lists.
     */
    void join(List list) {
        myList.addAll(list);
    }

    /*14. Write a Java program to clone an array list to another array list.
     */
    void clone(List clone){
        for(Object object : myList)
            clone.add(object);
    }
    /*15. Write a Java program to empty an array list and check list is empty or not*/

    boolean empty() {
       return myList.isEmpty();
    }
    /*16. Write a Java program to replace the second element of a ArrayList with the specified element. */

    void replace (String str){
        myList.set(1, str);
    }

    /*17. Write a Java program to print all the elements of a ArrayList using the position of the elements. */
    void printAll(){
        int size = myList.size();
        for (int index=0; index < size; index++){
            System.out.println(myList.get(index));
        }
    }
}
