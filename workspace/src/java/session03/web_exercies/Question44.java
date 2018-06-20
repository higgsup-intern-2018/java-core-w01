package session03.web_exercies;

public class Question44 {
    /*
    *44. What is the value of i after the following confusing code is executed?
    * */
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i);

        i = i++;
        System.out.println("(i = i++) = " + i);//10

        i = ++i;
        System.out.println("(i = ++i) = " + i);//11, i tăng 1 giá trị

        i = i++ + ++i;
        System.out.println("(i = i++ + ++i) = " + i);
    }
}
