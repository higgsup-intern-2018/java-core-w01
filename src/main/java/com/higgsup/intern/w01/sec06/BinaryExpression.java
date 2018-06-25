package com.higgsup.intern.w01.sec06;

public  abstract class BinaryExpression extends Expression {
   private Expression left;
    private Expression right;

    public BinaryExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    public Expression left()
    {
        return this.left;
    }

    public Expression right()
    {
        return this.right;
    }

    public String toString(){
        return "Value: " + evaluate();
    }

    public abstract int evaluate();
}
