package session04.exercies;

public class Quesions {
    /*
    *5.What is wrong with the following code fragment?
    *       int[] a;
            for (int i = 0; i < 10; i++)
                a[i] = i * i;
    * Lỗi xảy ra ở đây là : Không cấp phát bộ nhớ cho mảng a.
    * */
    /*
    *9.What does the following code fragment print?
    *   int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        System.out.println(a == b);
    *Chương trình sẽ in ra false.
    * */
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        System.out.println(a == b);
    }
}
