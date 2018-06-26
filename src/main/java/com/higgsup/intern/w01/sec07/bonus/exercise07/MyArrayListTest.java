package com.higgsup.intern.w01.sec07.bonus.exercise07;

import com.higgsup.intern.w01.sec07.bonus.exercise06.MyList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("java");
        myArrayList.add("objective c");
        myArrayList.add("swift");
        myArrayList.add("c#");
        myArrayList.add("c++");
        myArrayList.add("python");
        for (int i = 0; i < myArrayList.size(); i++){
            System.out.println(myArrayList.get(i));
        }

    }

}
