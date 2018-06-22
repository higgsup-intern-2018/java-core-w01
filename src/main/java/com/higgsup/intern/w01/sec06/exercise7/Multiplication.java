package com.higgsup.intern.w01.sec06.exercise7;

public class Multiplication extends BinaryExpression
{
    public Multiplication(Expression left, Expression right)
    {
        super(left, right);
    }


    @Override
    public int evaluate() {
        return left().evaluate() * right().evaluate();
    }
}
