package tranning.java.Session03.Exercies;

public class Question14 {
    /*
    *14. What does the following code print out?
    * */
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
            //sẽ in ra 1,1,2,3,5,8,....
        }
    }
}
