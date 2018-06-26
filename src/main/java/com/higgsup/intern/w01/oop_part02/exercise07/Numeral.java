package com.higgsup.intern.w01.oop_part02.exercise07;

public class Numeral extends Expression {
    private int value;
    public Numeral(int numeral){
        this.value = numeral;
    }
    public Numeral(){

    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int valuate() {
        return value;
    }
}
