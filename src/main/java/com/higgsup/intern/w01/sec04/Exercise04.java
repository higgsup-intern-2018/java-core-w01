package com.higgsup.intern.w01.sec04;

import java.util.Arrays;

//Write a code fragment that reverses the order of values in a one-dimensional string array. Do not create another array
// to hold the result. Hint: Use the code in the text for exchanging two elements.
public class Exercise04 {
    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4, 5};
        int length = myArray.length;
        int tempt;

        for (int i = 0; i< length/2; i++){
            tempt = myArray[length-i-1];
            myArray[length-i-1] = myArray [i];
            myArray[i] = tempt;
        }

        System.out.println(Arrays.toString(myArray)); // Kết qủa: [5, 4, 3, 2, 1]
    }
}
