package com.higgsup.intern.w01.sec07.general.scjp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {
        Object o = new Object();
        LinkedHashSet s = new LinkedHashSet();  //insert code here.
        s.add("o");
        s.add(o);
        System.out.println(s);

       /* And these three fragments:
        I.   Set s = new HashSet();
        II.  TreeSet s = new TreeSet();
        III. LinkedHashSet s = new LinkedHashSet();*/

       /*When fragments I, II, or III are inserted, independently, at line 7, which are true? (Choose all that apply.)
            A. Fragment I compiles
            B. Fragment II compiles
            C. Fragment III compiles
            D. Fragment I executes without exception
            E. Fragment II executes without exception
            F. Fragment III executes without exception*/
    }
    // Choose A B C D F.
    // E sai vì TreeSet cần so sánh các phần tử với nhau mà "o" và o không cùng kiểu DL
    // nên chương trình vẫn compile và sẽ sảy ra exception
}
