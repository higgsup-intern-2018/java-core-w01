package session05.part02.excercies07;

public class Addtion extends BinaryExpression {
    public Addtion(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left().evaluate() + right().evaluate();
    }

}
