package com.higgsup.intern.w01.sec05.part02.Exercise07;

public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return " " + evaluate();
    }

    @Override
    public int evaluate() {
        return left().evaluate()/right().evaluate();
    }
}
