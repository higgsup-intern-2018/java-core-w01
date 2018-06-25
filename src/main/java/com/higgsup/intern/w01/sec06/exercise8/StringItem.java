package com.higgsup.intern.w01.sec06.exercise8;

public class StringItem implements Item
{
    private String value;

    public StringItem(String value)
    {
        this.value = value;
    }

    @Override
    public Item clone() {
        StringItem stringItem = new StringItem(value);
        return stringItem;
    }

    public String toString()
    {
        return value;
    }

}
