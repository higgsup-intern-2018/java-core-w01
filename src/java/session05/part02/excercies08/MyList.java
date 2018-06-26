package session05.part02.excercies08;

public class MyList implements Item {
    public Node start;
    public Node end ;
    public MyList() {
    }
    public void append(Item item){

    }
    public void appendList(MyList myList){

    }


    @Override
    public Item clone() {

        return null;
    }
    @Override
    public String toString() {
        return "Node : "+start +" , "+end;
    }
}
