package java.Session03.WebExercies;
/*
*Will the following code fragment compile? If so, what will it do?
    int a = 10, b = 18;
    if (a = b) System.out.println("equal");
    else       System.out.println("not equal");
* */
public class Question70 {
    public static void main(String[] args) {
        int a = 10, b = 18;
        if (a == b) System.out.println("equal"); //Chuyển = thành ==
        else       System.out.println("not equal");
    }
}
