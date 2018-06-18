package com.higgsup.intern.w01.sec03.web;
//What is the value of the variable s after running the following loop when N = 1, 2, 3, 4, and 5.
public class Exercise77 {
    public static void main(String[] args) {
        String s = "";
        int N = 5 ;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) s = s + i + s;
            else            s = i + s + i;
        }
        System.out.println(s);
    }
}
/* Kết quả:
N = 1 -> s = "11"
N = 2 -> s = "11211"
N = 3 -> s = "3112113"
N = 4 -> s = "311211343112113"
N = 5 -> s = "53112113431121135"
*/
