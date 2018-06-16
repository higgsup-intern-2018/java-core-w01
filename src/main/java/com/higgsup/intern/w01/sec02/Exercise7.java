package com.higgsup.intern.w01.sec02;

public class Exercise7
{
    public static void main(String[] args) {
        System.out.println(2 + "bc");          //print 2bc  (convert 2 to string using + operator)
        System.out.println(2 + 3 + "bc");      //print 5bc  (calculate 2 + 3 first, then convert to string using + operator)
        System.out.println((2 + 3) + "bc");    //print 5bc  (calculate 2 + 3 first, then convert to string using + operator)
        System.out.println("bc" + (2 + 3));    //print 5bc  (calculate 2 + 3 in parentheses first, then convert to string using + operator)
        System.out.println("bc" + 2 + 3);      //print bc23 (convert 2 and 3 to string using + operator)
    }
}
