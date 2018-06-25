package com.higgsup.intern.w01.sec06.exercise8;

public class MyListDemo
{
    public static void main(String[] args)
    {
        MyList l = new MyList();
        l.append(new NumeralItem(1));
        l.append(new NumeralItem(2));
        l.append(new StringItem("b"));
        System.out.println(l);
        System.out.println(l.length());
        Item i = new NumeralItem(2);
        System.out.println(l.find(i));
    }
}
