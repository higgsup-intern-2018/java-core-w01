package java.Session03.WebExercies;
/*
*1. Write a program RollDie.java that generates the result of rolling a fair six-sided die (an integer between 1 and 6).
* */
public class Question01 {
    public static void main(String[] args) {
        int a =6;
        int roll = (int) ((Math.random()*a)+1);
        System.out.println(roll);
    }

}
