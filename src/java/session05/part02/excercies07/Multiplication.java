package session05.part02.excercies07;

public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right)
    {
        super(left, right);
    }
    @Override
    public int evaluate() {
        return left().evaluate() * right().evaluate();
    }
}
