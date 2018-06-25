package com.higgsup.intern.w01.sec06.exercise8;

public class NumeralItem implements Item
{
    private int value;

    public NumeralItem(int value)
    {
        this.value = value;
    }

    @Override
    public Item clone() {
        NumeralItem numeralItem = new NumeralItem(value);
        return numeralItem;
    }

    public String toString()
    {
        return "" + value;
    }

}
