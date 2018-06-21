package session04.exercies;

import java.util.Arrays;

/*
*4.Write a code fragment that reverses the order of values in a one-dimensional string array.
 * Do not create another array to hold the result
* */
public class Question04 {
    public static void main(String[] args) {
        int[] a={1,5,8,10,30};
        int n = a.length;
        int temp;
        for (int i = 0; i < n/2; i++) {
             temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;

        }
            System.out.println(Arrays.toString(a));
    }

}