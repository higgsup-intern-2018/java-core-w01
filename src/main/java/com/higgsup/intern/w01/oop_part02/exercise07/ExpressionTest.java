package com.higgsup.intern.w01.oop_part02.exercise07;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression expressionNum = new Numeral(3);
        Expression expression = new Square(expressionNum);
        expression.valuate();
        Expression expressionNum2 = new Numeral(1);

        Expression expression2 = new Addition(expression,expressionNum2);
        Expression expression3 = new Square(expression2);
        System.out.println("Addition result: "+expression2.valuate());

        Expression expression4 = new Subtraction(expression,expressionNum2);
        Expression expression5 = new Square(expression4);
        System.out.println("Subtraction result: "+expression4.valuate());

        Expression expression6 = new Multiplication(expression,expressionNum2);
        Expression expression7 = new Square(expression6);
        System.out.println("Multiplication result: "+expression6.valuate());

        Expression expression8 = new Division(expression,expressionNum2);
        Expression expression9 = new Square(expression8);
        System.out.println("Division result: "+expression8.valuate());

    }
}
