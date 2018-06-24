package com.higgsup.intern.w01.sec05.part02.Exercise07;

public class Numeral extends Expression {
    private int value;

    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " "+ value;
    }

    @Override
    public int evaluate() {
        return this.value;
    }
}
