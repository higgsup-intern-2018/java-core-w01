package tranning.java.Session03.WebExercies;

public class Question06 {
    /*
    * 6. What's wrong with the following loop?
    *   boolean done = false;
        while (done = false) {
        ...
        }
    * */
    public static void main(String[] args) {
        //Sử dụng == thay vì dùng =
        boolean done = false;
        while (done == false) {

        }
        //vì done luôn false nên ta nên viết như sau
        while (!done) {

        }
    }
}
