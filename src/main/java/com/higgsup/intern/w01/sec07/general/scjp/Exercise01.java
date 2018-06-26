package com.higgsup.intern.w01.sec07.general.scjp;

import java.util.List;
import java.util.ArrayList;

public class Exercise01 {
    public static void main(String[] args) {
//           // INSERT DECLARATION HERE
        List<List<Integer>> table = new ArrayList<List<Integer>>();
           for (int i = 0; i <= 10; i++) {
             List<Integer> row = new ArrayList<Integer>();
             for (int j = 0; j <= 10; j++)
               row.add(i * j);
             table.add(row);
           }
           for (List<Integer> row : table)
             System.out.println(row);
           }
//Which statements could be inserted at // INSERT DECLARATION HERE to allow this code to compile and run? (Choose all that apply.)
//A. List<List<Integer>> table = new List<List<Integer>>();     => List ilà 1 interface nên k thể sử dụng new List
//B. List<List<Integer>> table = new ArrayList<List<Integer>>();
//C. List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();  => <ArrayList<Integer> không tương ứng với đối số ở vế trái
//D. List<List, Integer> table = new List<List, Integer>();    => <List, Integer> just use in Map
//E. List<List, Integer> table = new ArrayList<List, Integer>();    => <List, Integer> just use in Map
//F. List<List, Integer> table = new ArrayList<ArrayList, Integer>();   => <List, Integer> just use in Map
//G. None of the above

//    Choose B
}
