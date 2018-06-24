package com.higgsup.intern.w01.sec05.part02.Exercise07;

public abstract class BinaryExpression extends Expression {

    private Expression left;
    private Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public Expression left(){
        return this.left = left;
    }
    public Expression right(){
        return this.right = right;
    }
    @Override
    public String toString() {
        return null;
    }

    public abstract int evaluate();
}
