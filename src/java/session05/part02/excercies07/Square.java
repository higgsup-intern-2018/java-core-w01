package session05.part02.excercies07;

public class Square extends Expression {
    Expression expression;
    public  Square(Expression expression)
    {
        this.expression=expression;
    }

    @Override
    public String toString() {
        return " "+evaluate();
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(),2);
    }
}
