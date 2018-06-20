package com.higgsup.intern.w01.sec04;

public class Exercise05 {
    public static void main(String[] args) {
        int[] a;  /* không chạy được vì bình thường khai báo một mảng là ta phải khởi tạo giá trị, tức là kích thước của mảng
        còn ở trong bài này là ko có nên ko thể chạy được vòng for */
        for(int i=0 ; i<10 ; i++)
            a[i] = i * i;

    }
}
