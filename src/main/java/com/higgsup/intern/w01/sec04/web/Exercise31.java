package com.higgsup.intern.w01.sec04.web;
//What happens when you try to compile a program with the following statement?
public class Exercise31 {
    public static void main(String[] args) {
        int[] a = new int[-17]; //Chương trình sẽ throw ra exception: java.lang.NegativeArraySizeException
        //Do giá trị kích thước của mảng là giá trị âm
    }
}
