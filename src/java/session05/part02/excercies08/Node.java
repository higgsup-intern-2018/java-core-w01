package session05.part02.excercies08;

public class Node {
    public Item data;
    public Node next;
    public Node(Item data){
        this.data = data.clone();
    }
}
