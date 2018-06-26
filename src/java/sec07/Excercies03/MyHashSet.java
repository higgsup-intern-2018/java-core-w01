package sec07.Excercies03;

import java.util.*;

public class MyHashSet {
    HashSet<String> set = new HashSet<>(Arrays.asList("one","three","five","six"));
    /*
    * 1.Write a Java program to append the specified element to the end of a hash set.
    * */
    void add(){
        System.out.println("- Add to the end : ");
        set.add("seven");
        System.out.println(set);
    }
    /*
    * 2.Write a Java program to iterate through all elements in a hash list.
    * */
    void iterate(){
        Iterator<String> iterator = set.iterator();
        System.out.println("- Iterator : ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    /*
    * 3.Write a Java program to get the number of elements in a hash set.
    * */
    void getNumber(){
        System.out.println("- Get the number of elements in a hash set. : ");
        System.out.println(set.size());
    }
    /*
    * 4.Write a Java program to empty an hash set and check hash set is empty or not.
    * */
    void emptyHashset(){
        System.out.println("- Hash set is empty or not");
        HashSet<String> set1 = new HashSet<>();
        if (set1.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("No empty");
        }
    }
    /*
    * 5.Write a Java program to clone a hash set to another hash set.
    * */
    void clones(){
        System.out.println("- Clone a hash set to another hash set :");
        HashSet <String> set2 = new HashSet <String>();
        System.out.println("Old set : "+set);
        set2 = (HashSet) set.clone();
        System.out.println("New set :"+set2);
    }
    /*
    * 6.Write a Java program to convert a hash set to an array.
    * */
    void convertToArray(){
        System.out.println("- Convert a hash set to an array :");
        String[] array = new String[set.size()];
        set.toArray(array);
        System.out.println("Array contains : ");
        for (String item: array) {
            System.out.println(item);
        }
    }
    /*
    * 7.Write a Java program to convert a hash set to a tree set.
    * */
    void convertToTreeSet(){
        System.out.println("- Convert a hash set to an tree set :");
        Set<String> treeSet = new TreeSet<String>(set);
        System.out.println("Tree set contains : ");
        for (String item: treeSet) {
            System.out.println(item);
        }
    }
    /*
    * 8.Write a Java program to convert a hash set to a List/ArrayList.
    * */
    void convertToList(){
        System.out.println("- Convert a hash set to a List/ArrayList :");
        List<String> arrayList = new ArrayList<String>(set);
        System.out.println("ArrayList contains: "+ arrayList);
    }
    /*
    * 9..Write a Java program to compare two hash set
    * */
    void compare(){
        System.out.println("- Compare two sets:");
        HashSet<String> set3 = new HashSet<>(Arrays.asList("one","six","zero"));
        for (String element : set){
            System.out.println(set3.contains(element) ? "Yes" : "No");
        }
    }
    /*
    * 10.Write a Java program to compare two sets and retain elements which are same on both sets.
    * */
    void compare2(){
        System.out.println("- Compare two sets and retain elements which are same on both sets :");
        HashSet<String> set4 = new HashSet<>(Arrays.asList("one","six","zero"));
        set.retainAll(set4);
        System.out.println("Hash set content "+set);
    }
    /*
    * 11. Write a Java program to remove all of the elements from a hash set.
    * */
    void removeAll(){
        System.out.println("- Remove all of the elements from a hash set :");
        set.clear();
        System.out.println("Hash set after remove all :" +set);
    }
}
