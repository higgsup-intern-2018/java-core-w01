package tranning.java.Session04.Exercies;
/*
*4.Write a code fragment that reverses the order of values in a one-dimensional string array.
 * Do not create another array to hold the result
* */
public class BubbleSort {

    static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={50,9,7,90,3,100,234,2,6,1};
        bubbleSort(arr);
        System.out.println("Array after Bubble Sort :");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}