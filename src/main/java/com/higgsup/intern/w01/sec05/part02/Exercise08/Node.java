package com.higgsup.intern.w01.sec05.part02.Exercise08;

public class Node {
    public Item data;
    public Node next;

    public Node(Item data) {
        this.data = data.clone();
    }
}
