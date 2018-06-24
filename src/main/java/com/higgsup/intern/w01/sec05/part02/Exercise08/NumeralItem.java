package com.higgsup.intern.w01.sec05.part02.Exercise08;

public class NumeralItem implements Item {
    private int value;

    public NumeralItem(int value) {
        this.value = value;
    }

    @Override
    public Item clone() {
        return null;
    }
}
