package java.Session03.WebExercies;

public class Question84 {
    /*
    * What happens when you try to compile the following code fragment?
        double x;
        if (a >= 0) x = 3.14;
        if (a <  0) x = 2.71;
        System.out.println(x);
    * */
    public static void main(String[] args) {
        double x=0;
        int a=3;
        if (a >= 0) x = 3.14;
        if (a <  0) x = 2.71;
        System.out.println(x);//biến x chưa được khởi tạo
    }
}
