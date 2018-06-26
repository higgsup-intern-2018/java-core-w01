package com.higgsup.intern.w01.sec07.ex06;

import java.util.*;

public class MyList {
    private List<Integer> numbers;

    public MyList() {
        numbers = new ArrayList<>();
    }
    //Assigns value for numbers
    void setData(List<Integer> numbers) {
        this.numbers = numbers;
    }
    //Assigns value for numbers
    void setData(int[] numbers) {
        this.numbers = Arrays.asList(numbers.length);
    }
    //sort by ascending
    void sort(){
        Collections.sort(numbers);
    }
    //add a element to numbers
    void add(int number){
        numbers.add(number);
    }
    //add a elements with specified index
    void add(int index, int number){
        numbers.add(index, number);
    }
    //add a array to numbers
    void add(int[] listOfNumbers){
        for (int e : listOfNumbers){
            numbers.add(e);
        }
    }
    //remove element
    void removeElement(int element){
        numbers.remove(element);
    }
    //Delete elements having range [from, to]
    void removeRange(int fromIndex, int toIndex){
        Iterator <Integer> itr = numbers.iterator();
        while (itr.hasNext()){
            Integer integer = itr.next();
            if ( integer >= fromIndex && integer <= toIndex){
                itr.remove();
            }
        }
    }
    //fillRange(int from, int to)
    //reverse
    void reverse(){
        Collections.reverse(numbers);
    }










}
