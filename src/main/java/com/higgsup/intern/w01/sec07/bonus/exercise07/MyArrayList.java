package com.higgsup.intern.w01.sec07.bonus.exercise07;

public class MyArrayList {
    private int size;
    private int capacity;
    private String[] strings;

    public int size() {
        return size;
    }

    public MyArrayList() {
        this.capacity = 10;
        this.strings = new String[capacity];
    }

    public MyArrayList(int capacity){
        this.strings = new String[capacity];
    }
    public boolean indexCheck(int index) {
        boolean isExisted;
        if (index < 0 || index > capacity) {
            isExisted = false;
            System.out.print("Index is not existed");
        } else {
            isExisted = true;
        }
        return isExisted;
    }
     public String get(int index) {
        String result = "";
        if (indexCheck(index)){
            result = strings[index];
        }
        return result;
     }

    public void add(String element){
       size+=1;
       if (size == capacity){
           capacity *= 1.5;
           String[] strings2 = new String[capacity];
           for (int i = 0; i< size; i++){
               strings2[i] = strings[i];

           }
           strings = strings2;
       }
       strings[size - 1] = element;
    }

    public void add(int index, String element){

    }

    public void clear(){
        for (int i = 0; i < strings.length; i++){
            strings[i] = null;
        }
        size = 0;
    }
}
