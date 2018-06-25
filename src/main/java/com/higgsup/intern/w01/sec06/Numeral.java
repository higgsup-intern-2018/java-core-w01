package com.higgsup.intern.w01.sec06;

public class Numeral extends Expression {
    private int value;

    public Numeral(){}

    public Numeral(int value){
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "Value:"+this.value;
    }
}
