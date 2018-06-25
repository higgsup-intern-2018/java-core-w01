package com.higgsup.intern.w01.sec06.exercise8;

public class MyList
{
    private Node start;
    private Node end;

    public MyList()
    {
        start = null;
        end = null;
    }

    public void append(Item i)
    {
        Node n = new Node(i, null);
        if(start == null) {
            start = n;
            end = start;
        }else{
            Node prev = end;
            end = n;
            prev.next = end;
        }
    }

    public void appendList(MyList list)
    {

    }

    public String toString()
    {
        String s = "(";
        Node temp = start;
        while(temp != null)
        {
            s += temp.data + ", ";
            temp = temp.next;
        }
        s += ")";
        return s;
    }

    public int length()
    {
        int count = 0;
        Node temp = start;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean equals(MyList list) {
        return false;
    }

    public Item find(Item i)
    {
        Node temp = start;
        while(temp != null)
        {
            if(temp.data.equals(i))
            {
                return temp.data;
            }else{
                temp = temp.next;
            }
        }
        return null;
    }

    public void invert()
    {

    }
}
