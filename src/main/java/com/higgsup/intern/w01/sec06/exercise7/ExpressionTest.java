package com.higgsup.intern.w01.sec06.exercise7;

public class ExpressionTest
{
    public static void main(String[] args)
    {
        Expression e1 = new Numeral(3);
        Expression e2 = new Square(e1);             //Square test
        Expression e3 = new Numeral(1);
        Expression e4 = new Addition(e2, e3);       //Add test
        Expression e5 = new Square(e4);
        Expression e6 = new Subtraction(e2, e3);    //Subtract test
        Expression e7 = new Multiplication(e2, e3); //Multiplication test
        Expression e8 = new Division(e2, e3);       //Division test
        Expression e9 = new Numeral(0);
        Expression e10 = new Division(e4, e9);

        System.out.println(e5);
        System.out.println(e6);
        System.out.println(e7);
        System.out.println(e8);
        System.out.println(e10);
    }
}
