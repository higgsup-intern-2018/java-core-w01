package session03.exercies;

public class Question13 {
    /*
    * 13. What is the value of m and n after executing the following code?
    * */
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println( m );
        System.out.println(n);
    }
}
