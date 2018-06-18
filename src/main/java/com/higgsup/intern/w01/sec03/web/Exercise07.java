package com.higgsup.intern.w01.sec03.web;
//What's wrong with the following loop that is intended to compute the sum of the integers 1 through 100?
public class Exercise07 {
    public static void main(String[] args) {
        int N = 100;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
//            int sum = 0; Biến sum phải được khởi tạo bên ngoài vòng loop, nếu để trong vòng loop thì giá trị sum luôn được khải tạo trong mỗi vòng lặp
              sum = sum + i;
        }
        System.out.println(sum); // biến sum sẽ ko thể được gọi từ bên ngoài vòng loop.
    }
}
