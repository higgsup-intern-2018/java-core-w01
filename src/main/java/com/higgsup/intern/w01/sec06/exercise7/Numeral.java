package com.higgsup.intern.w01.sec06.exercise7;

public class Numeral extends Expression
{
    private int value;

    public Numeral(int value)
    {
        this.value = value;
    }

    public Numeral()
    {

    }

    @Override
    public int evaluate() {
        return this.value;
    }

    public String toString()
    {
        return "Value: " + value;
    }
}
