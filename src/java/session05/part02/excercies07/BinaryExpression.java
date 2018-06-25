package session05.part02.excercies07;

public abstract class BinaryExpression extends Expression{
    private Expression left;
    private Expression right;
    public BinaryExpression(Expression left,Expression right)
    {
        this.left=left;
        this.right = right;
    }

    public Expression left()
    {
        return this.left;
    }
    public Expression right() {
       return this.right;
    }

    @Override
    public String toString() {
        return "" + evaluate();
    }


    public abstract int evaluate() ;
}
