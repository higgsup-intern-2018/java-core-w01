package com.higgsup.intern.w01.sec07.ex02;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AllList {
    private List allList;


    public AllList(List list){
        allList = list;
    }

    public void add(String s){
        allList.add(s);
    }

    public void print(){
        System.out.println(allList.toString());
    }

    public void iterate(){
        System.out.println("Iterate: ");
        Iterator<String> iterator = allList.iterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            System.out.println(color);
        }
        System.out.println();
    }

    public void insert(String color)
    {
        allList.add(0, color);
    }

    public void update(int position, String update)
    {
        allList.set(position, update);
    }

    public void retrieve(int index)
    {
        System.out.println(allList.get(index));
    }

    public void removeThird()
    {
        allList.remove(2);
    }

    public boolean searchElement(String color)
    {
        for(Object c: allList)
        {
            if(c.toString().equalsIgnoreCase(color))
            {
                return true;
            }
        }
        return false;
    }

    public void sortArray()
    {
        Collections.sort(allList);
    }

    public void copy(List list)
    {
        for(Object c : allList)
        {
            list.add(c);
        }
    }

    public void shuffle() //để truy cập ngẫu nhiên các phần tử trong Collection
    {
        Collections.shuffle(allList);
    }

    public void reverse() // phương thức hoán đổi vị trí của các phần tử , từ đầu đến cuối thì đổi ngược lại từ cuối lên đầu
    {/* ví dụ: đỏ xanh cam trắng đen --> đen trắng cam xanh đỏ*/
        Collections.reverse(allList);
    }

    public boolean compare(List list)
    {
        return allList.equals(list);
    }

    public void join(List list)
    {
        allList.addAll(list);
    }

    public void clone(List clone)
    {
        for(Object o : allList)
            clone.add(o);
    }

    public void emptyList()
    {
        allList.clear();
    }

    public boolean isEmpty() // kiem tra neu colelction rong
    {
        return allList.isEmpty();
    }

    public void printAll()
    {
        for(int i = 0; i < allList.size(); i++)
        {
            System.out.print(allList.get(i) + " ");
        }
    }



}
