package com.higgsup.intern.w01.sec05.part02.Exercise07;

public class ExpressionTest {
    public static void main(String[] args) {
        //(3^2+1)^2 = ?
        Expression expression1 = new Numeral(3);
        Expression expression2 = new Square(expression1);
        Expression expression3 = new Numeral(1);
        Expression expression4 = new Addition(expression2, expression3);
        Expression expression5 = new Square(expression4);
        System.out.println("(3^2+1)^2 =" + expression5);

        //3^2+3-1=?
        Expression expression6 = new Addition(expression2, expression1);
        Expression expression7 = new Subtraction(expression6, expression3);
        System.out.println("3^2+3-1 =" + expression7);

        //(3^2+3-1)*13=?
        Expression expression8 = new Numeral(13);
        Expression expression9 = new Multiplication(expression7, expression8);
        System.out.println("(3^2+3-1)*13 =" + expression9);

        //(3^2+3-1)*13/11=?
        Expression expression10 = new Numeral(11);
        Expression expression11 = new Division(expression9, expression10);
        System.out.println("(3^2+3-1)*13/11 ="+ expression11);
    }
}
