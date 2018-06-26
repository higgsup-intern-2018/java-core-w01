package com.higgsup.intern.w01.oop_part02.exercise07;

public class Square extends Expression{
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int valuate() {
        return expression.valuate() * expression.valuate();
    }
}
