package session03.exercies;
/*
* 9.Write a program FivePerLine.java that, using one for loop and one if statement,
* prints the integers from 1000 to 2000 with five integers per line
* Viết một chương trình sử dụng vòng for và câu lệnh if in ra các số từ 1000 tới 2000 thành 5 dòng.
* */
public class Question09 {
    public static void main(String[] args) {
        int start =1000 , end =2000,per_line=5;
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if ((i + 1) % per_line == 0) System.out.println();
        }
        System.out.println();
    }
}
