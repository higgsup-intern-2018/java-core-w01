package com.higgsup.intern.w01.sec06.exercise7;

public class Division extends BinaryExpression
{
    public Division(Expression left, Expression right)
    {
        super(left, right);
    }



    @Override
    public int evaluate() {
        if (right().evaluate() == 0) {
            System.out.println("Cannot divide by zero");
            return -1;
        } else {
            return left().evaluate() / right().evaluate();
        }
    }
}
