package com.higgsup.intern.w01.sec07.general;

import java.util.*;

public class Exercise02 {

//    to iterate through all elements in a array list.
    public static void iterateList(List<String> arrayList) {
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.printf(iterator.next()+"  ");

        }
    }

//     insert an element into the array list at the first position.
    public static void insertFirstColor(List<String> arrayList, String color){
        arrayList.add(0,color);
        iterateList(arrayList);
    }

//    retrieve an element (at a specified index) from a given array list
    public static void getItem(List<String> arrayList, int index){
        if(index > arrayList.size()){
            System.out.println("Out of array size");
        } else {
            System.out.printf("Color at index "+index+" is "+arrayList.get(index));
        }
    }

//    update specific array element by given element
    public static void updateItem(List<String> arrayList,int index,String updateContent){
        if(index > arrayList.size()){
            System.out.println("Out of array size");
        } else{
            System.out.println("Color at index "+index+" before update is "+arrayList.get(index));
            arrayList.remove(index);
            arrayList.add(index,updateContent);
            System.out.println("Color at index "+index+" after update is "+arrayList.get(index));
            System.out.println("List after update is: ");
            iterateList(arrayList);
        }
    }

//    remove the third element from a array list
    public static void removeThirdItem(List<String> arrayList) {
        System.out.println("Third item in array is: "+arrayList.get(2));
        arrayList.remove(2);
        System.out.println("Array after remove the third element: ");
        iterateList(arrayList);
    }

//    Search an element in a array list
    public static void searchElement(List<String> arrList){
        System.out.print("List contain: ");
        iterateList(arrList);
        System.out.println("\nWhat item do you want to search? ");
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        item = item.toLowerCase();
        int count = 0;
        for (int i = 0; i < arrList.size(); i++){
            arrList.set(i,arrList.get(i).toLowerCase());
            if (arrList.get(i).equals(item)){
                System.out.println("Item you need is '"+arrList.get(i)+"' at index: "+i);
                count+= 1;
            }
        }
        if(count == 0){
            System.out.println("List not contain item you need.");
        }
    }

//    Sort a given array list
    public static void sortASC(List<String>arrayList){
        System.out.print("List before sort: ");
        iterateList(arrayList);
        for (int i = 0; i < arrayList.size()-1; i++){
            for (int j  = i+1; j<arrayList.size(); j++){
                if(arrayList.get(i).compareTo(arrayList.get(j)) > 0){
                    String temp = arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,temp);
                }
            }
        }
        System.out.print("\nList after sort: ");
        iterateList(arrayList);
    }

//    Copy one array list into another
    public static void copyArray(List<String>arrayList){
        ArrayList<String> myObject = new ArrayList<String>(arrayList);
        System.out.println("The content of copy array: ");
        iterateList(myObject);
    }

//    Shuffle elements in a array list
    public static void shuffleElement(List<String>arrayList){
        System.out.println("Before shuffling, ArrayList contains : ");
        iterateList(arrayList);
        Collections.shuffle(arrayList);
        System.out.println("\nAfter shuffling, ArrayList contains : ");
        iterateList(arrayList);
    }

//      Reverse elements in a array list
    public static void reverseElement(List<String> arrayList){
        Collections.reverse(arrayList);
        System.out.print("After Reverse Order, ArrayList Contains : ");
        iterateList(arrayList);
    }

//      Compare two array lists
    public static void compareArray(List<String> arrayList1,List<String> arrayList2){

        if (arrayList1.containsAll(arrayList2) && arrayList2.containsAll(arrayList1)){
            System.out.print(" 2 array equals");
        }else{
            System.out.print("2 array not equals");
        }
    }

//    Join two array lists
    public static void joinArray(List<String> arrayList1,List<String> arrayList2){
        List<String> listJoin = new ArrayList<>();
        listJoin.addAll(arrayList1);
        listJoin.addAll(arrayList2);
        System.out.print("Array after join: ");
        iterateList(listJoin);
    }

//      Clone an array list to another array list
    public static void cloneArray(List<String> arrayList1){
        List<String> listClone = new ArrayList<>();
        listClone.addAll(arrayList1);
        System.out.print("List after clone: ");
        iterateList(listClone);
    }

//      Empty an array list and check list is empty or not
    public static void isEmptyArray(List<String> arrayList){
        List<String> listEmpty = new ArrayList<>();
        listEmpty.addAll(arrayList);
        System.out.print("List before clear all is: ");
        iterateList(listEmpty);
        listEmpty.clear();
        if (listEmpty.isEmpty()){
            System.out.print("\nClear list success!");
        } else {
            System.out.print("\nList after clear: ");
            iterateList(listEmpty);
        }
    }

//      Replace the second element of a ArrayList with the specified element.
    public static void replaceSecondItem(List<String>arrayList, String strReplace){
        arrayList.remove(1);
        arrayList.add(1,strReplace);
        System.out.print("List after replace the second element: ");
        iterateList(arrayList);
    }

//      Print all the elements of a ArrayList using the position of the elements
    public static void printDetailArray(List<String>arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println("item at index "+i+" : "+arrayList.get(i));
        }
    }

    public static void main(String[] args) {
//        Create a new array list, add some colors (string) and print out the collection.
        List<String> listColor = new ArrayList<>();
        listColor.add("Green");
        listColor.add("Blue");
        listColor.add("Red");
        listColor.add("Black");
        listColor.add("White");
        listColor.add("Pink");
        listColor.add("Grey");
        listColor.add("Purple");
        listColor.add("Orange");
        listColor.add("Dark");
        listColor.add("Velvet");
        System.out.println("\n\n2. All elements in a array list");
        iterateList(listColor);

        System.out.println("\n\n3. Insert an element at the first position");
        insertFirstColor(listColor,"Yellow");

        System.out.println("\n\n4. Retrieve an element (at a specified index) from array list");
        getItem(listColor,3);

        System.out.println("\n\n5. Update specific array element by given element");
        updateItem(listColor,5,"Brown");

        System.out.println("\n\n6. Remove the third element from a array list");
        removeThirdItem(listColor);

        System.out.println("\n\n7. Search an element in a array list");
        searchElement(listColor);

        System.out.println("\n\n8. Sort a given array list");
        sortASC(listColor);

        System.out.println("\n\n9. Copy one array list into another");
        copyArray(listColor);

        System.out.println("\n\n10. Shuffle elements in a array list");
        shuffleElement(listColor);

        System.out.println("\n\n11. Reverse elements in a array list");
        reverseElement(listColor);

        List<String> listFruit = new ArrayList<>();
        listFruit.add("Lemon");
        listFruit.add("Apple");
        listFruit.add("Durian");
        listFruit.add("Cucumber");
        listFruit.add("Water melon");
        listFruit.add("Grape");

        System.out.println("\n\n12. Compare two array lists");
        compareArray(listColor,listFruit);

        System.out.println("\n\n13. Join two array lists");
        joinArray(listColor,listFruit);

        System.out.println("\n\n14. Clone an array list to another array list");
        cloneArray(listColor);

        System.out.println("\n\n15. Empty an array list and check list is empty or not");
        isEmptyArray(listColor);

        System.out.println("\n\n16. Replace the second element of a ArrayList with the specified element.");
        replaceSecondItem(listFruit,"Papaya");

        System.out.println("\n\n17. Print all the elements of a ArrayList using the position of the elements");
        printDetailArray(listColor);
    }
}
