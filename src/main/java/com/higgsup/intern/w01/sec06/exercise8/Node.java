package com.higgsup.intern.w01.sec06.exercise8;

public class Node
{
    public Item data;
    public Node next;

    public Node(Item item, Node next)
    {
        this.data = item.clone();
        this.next = next;
    }
}
