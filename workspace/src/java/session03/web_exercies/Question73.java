package session03.web_exercies;

public class Question73 {
    /*
    *What does the following code fragment do?
        for (int x = 0; x < 100; x += 0.5) {
        System.out.println(x);
       }
    * */
    public static void main(String[] args) {
        for (int x = 0; x < 100; x += 0.5) {
            System.out.println(x); //In ra vòng lặp vô cực 0 vì x += 0.5 tương đương với x = (int) x + 0.5
        }
    }
}
