package session05.part02.excercies07;

public class Numeral extends Expression {
    private int value;
    public Numeral(){}
    public Numeral(int value)
    {
        this.value=value;
    }

    @Override
    public String toString() {
        return "Value : "+value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
