package com.higgsup.intern.w01.oop_part02.exercise07;

public class Division extends BinaryExpress {
    private Expression left;
    private Expression right;
    public Division(Expression expression1, Expression expression2){
        this.left = expression1;
        this.right = expression2;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int valuate() {
        return left.valuate() / right.valuate();
    }
}
