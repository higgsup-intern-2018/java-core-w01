package com.higgsup.intern.w01.sec07.general.scjp;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Exercise03 {
    public static void before() {
        Set set = new TreeSet();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }

    public static void main(String[] args) {
        before();
    }
}
//A. The before() method will print 1 2
//B. The before() method will print 1 2 3
//C. The before() method will print three numbers, but the order cannot be determined
//D. The before() method will not compile
//E. The before() method will throw an exception at runtime

// choose E.
// TreeSet sắp xếp các phần tử theo thứ tự tăng dần
// nhưng đoạn code trên lại add cả phần tử String và int vào mảng nên sẽ xảy ra exception.