package session04.exercies;
/*
*2.Describe and explain what happens when you try to compile a program HugeArray.java with the following statement:
* */
public class Question2 {
    public static void main(String[] args) {
        int n = 1000;
        int[] a = new int[n*n*n*n];// sẽ bị lỗi Negative Array Size Exception ( không nhận kích thước mảng )
        System.out.println(a.length);
    }
}
