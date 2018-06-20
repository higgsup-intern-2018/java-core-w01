package java.Session03.WebExercies;

public class Question77 {
    /*
    * What is the value of the variable s after running the following loop when N = 1, 2, 3, 4, and 5.
        String s = "";
        for (int i = 1; i <= N; i++) {
        if (i % 2 == 0) s = s + i + s;
        else            s = i + s + i;
        }
    * */
    public static void main(String[] args) {
        String a = "";
        int n = 5 ;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) a = a + i + a;
            else            a = i + a + i;
        }
        System.out.println(a);
    }
}
