package session05.part02.excercies07;

public class Subtraction extends BinaryExpression{
    public Subtraction(Expression left, Expression right)
    {
        super(left, right);
    }
    @Override
    public int evaluate() {
        return left().evaluate() - right().evaluate();
    }
}
