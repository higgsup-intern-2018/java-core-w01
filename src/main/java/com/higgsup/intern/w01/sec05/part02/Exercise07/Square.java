package com.higgsup.intern.w01.sec05.part02.Exercise07;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return " " + evaluate();
    }

    @Override
    public int evaluate() {
        return (int)Math.pow(expression.evaluate(), 2);
    }
}
