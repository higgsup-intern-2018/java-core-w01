package sec07.Excercies02;

import java.util.ArrayList;
import java.util.List;

public class TestMyArrayList {
    public static void main(String[] args) {
        List myList = new ArrayList();
        MyArrayList myArrayList = new MyArrayList(myList);
        List cop = new ArrayList<>();
        List cl = new ArrayList<>();
        MyArrayList anotherList = new MyArrayList(cop);
        //Add
        System.out.println("1 : ");
        myArrayList.add("yellow");
        myArrayList.add("red");
        myArrayList.add("green");
        myArrayList.printList();
        //Iterate
        System.out.println("2 : ");
        myArrayList.iterate();
        System.out.println();
        //Retrieve
        System.out.println("3 : ");
        myArrayList.retrieve(1);
        //Insert
        System.out.println("4 : ");
        myArrayList.insert("Blue");
        myArrayList.printList();
        //Update specific array element by given element
        System.out.println("5 : ");
        myArrayList.update(2, "Black");
        myArrayList.printList();

        //remove the third element from a array list
        System.out.println("6 : ");
        myArrayList.remove();
        myArrayList.printList();

        //search an element in an array list
        System.out.println("7 : ");
        System.out.println(myArrayList.search("red"));
        System.out.println(myArrayList.search("green"));

        //Sort a given array list
        System.out.println("8 : ");
        myArrayList.sort();
        myArrayList.printList();

        //Copy one array list into another
        System.out.println("9 : ");
        myArrayList.copy(cop);
        System.out.print("List before: ");
        myArrayList.printList();
        System.out.println("Copied list: " + cop);

        //Shuffle elements in array list
        System.out.println("10: ");
        myArrayList.shuffle();
        myArrayList.printList();

        //Reverse elements in array list
        System.out.println("11 : ");
        myArrayList.reverse();
        myArrayList.printList();

        //Compare two array list
        System.out.println("12 : ");
        System.out.println(myArrayList.compare(cop));

        //Join two array list
        System.out.println("13 : ");
        myArrayList.join(cop);
        myArrayList.printList();


        //Clone an array list to another array list
        System.out.println("14 : ");
        myArrayList.clone(cl);
        System.out.print("Clone list: " + cl.toString());
        System.out.println();
        //Empty an array list
        System.out.println("15 : ");
        myArrayList.empty();
        myArrayList.printList();

        //Check list is empty or not
        System.out.println("16 : ");
        System.out.println(myArrayList.empty());
        System.out.println(anotherList.empty());

        //print all element using position of elements
        System.out.println("17 : ");
        anotherList.printAll();
    }

}
