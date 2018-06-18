package com.higgsup.intern.w01.sec02;

public class Exercise07 {
    //a: 2bc  because 2 is int value + String  "bc"
    //b: 5bc because 2 + 3 = 5 is int value + String "bc"
    //c: 5bc because (2+3) = 5 is int value + String "bc"
    //d: bc5 because First, java sees String "bc" and it will understand the result return is a String.
        // Then, it add (2+3)= 5 to this String.
    //e: bc23 because java sees String "bc" first and it will understand the resultreturn is a String.
        // Then it see "2" and "3" and understand they are Strings. Finally, java add them to the first string.
}
