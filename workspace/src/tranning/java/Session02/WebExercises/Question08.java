package tranning.java.Session02.WebExercises;

public class Question08 {
    /*
    * 8. Write a program DivideByZero.java to see what happens when you divide an int or double by zero.
    * Viết chương trình DiviByZero.java để xem điều gì xảy ra khi chia số kiểu int hoặc double cho 0
    * */
    public static void main(String[] args) {
        System.out.println("17.0 / 0.0 = " + (17.0 / 0.0)); //Ìninity
        System.out.println("17.0 % 0.0 = " + (17.0 % 0.0));//NaN
       System.out.println("17 / 0 = " + (17 / 0)); //erro
        System.out.println("17 % 0 = " + (17 % 0)); //erro
    }
}
