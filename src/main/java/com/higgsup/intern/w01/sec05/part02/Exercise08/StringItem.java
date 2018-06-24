package com.higgsup.intern.w01.sec05.part02.Exercise08;

public class StringItem implements Item{
    private String value;

    public StringItem(String value) {
        this.value = value;
    }

    @Override
    public Item clone() {
        return null;
    }
}
