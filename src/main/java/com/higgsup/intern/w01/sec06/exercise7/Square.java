package com.higgsup.intern.w01.sec06.exercise7;

public class Square extends Expression
{
    private Expression expression;

    public Square(Expression expression)
    {
        this.expression = expression;
    }

    public String toString()
    {
        return "Value: " + evaluate();
    }

    public int evaluate()
    {
        return (int)Math.pow(expression.evaluate(), 2);
    }
}
