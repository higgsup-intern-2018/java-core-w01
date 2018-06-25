package com.higgsup.intern.w01.sec06;

public class Addition extends BinaryExpression {
   public Addition(Expression left, Expression right)
   {
       super(left, right);
   }


    @Override
    public int evaluate() {
        return left().evaluate() + right().evaluate();
    }
}
