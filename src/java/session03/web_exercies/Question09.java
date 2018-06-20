package session03.web_exercies;

public class Question09 {
    /*
    * 9. What is wrong with the following code fragment?
    * */
    public static void main(String[] args) {
        double x = -32.2;
        boolean isPositive = (x > 0);
        if (isPositive = true) System.out.println(x + " is positive");
        else                   System.out.println(x + " is not positive");
        //Thay vì viết if (isPositive = true) thì ta có thể viết như dưới hoặc thay thế = thành ==
        if (isPositive ) System.out.println(x + " is positive");
        else                   System.out.println(x + " is not positive");
    }
}
