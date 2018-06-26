package com.higgsup.intern.w01.sec07.bonus.exercise06;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MyList {
    private List<Integer> numbers;
    public MyList(){
        numbers = new ArrayList<>();
    }

    public void setData(List<Integer> numbers){
        this.numbers = numbers;
    }

    public void setData(int[] numbers){

    }
    public void sort(List<Integer> numbers) {
        for(int i = 0; i < numbers.size() - 1; i++){
            for(int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(i) > numbers.get(j)){
                    Integer integer = numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j,integer);
                }
            }

        }
        foreach();
    }

    public void add(int number){
        this.numbers.add(number);
    }

    public void add(int index, int number){
        this.numbers.add(index,number);
    }

    public void add(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            this.numbers.add(numbers[i]);
        }
    }

    public void removeIndex (int index){
        if (index >= numbers.size()){
            System.out.print("\nIndex out of list size!");
        }else this.numbers.remove(index);
    }

    public void removeElement(int element){
        boolean isContain = true;
        for(int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == element){
                isContain = true;
            }else {
                isContain = false;
            }
        }
        if (isContain){
            this.numbers.remove(element);
        } else {
            System.out.print("\nNot found element '"+element+"'");
        }
    }

    public void removeRange(int from, int to){
        if (to >= this.numbers.size()){
            System.out.println("Oversize of list.");
        }else {
            for (int i = from; i <= to; i++){
                this.numbers.remove(i);
            }
        }
    }

    public void fillRange(int from, int to){

    }

    public void reverse1(){
        for (int i = this.numbers.size() - 1; i>= 0; i--){
            System.out.print(numbers.get(i)+" ");
        }
    }

    public void reverse2(){
        Collections.reverse(this.numbers);
        for (Integer integer : this.numbers){
            System.out.print(integer+" ");
        }
    }
    public void fori() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    public void foreach(){
        for(Integer integer : numbers){
            System.out.print(integer+" ");
        }
    }
    public void iterateList(){
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.printf(iterator.next()+"  ");

        }
    }
}
