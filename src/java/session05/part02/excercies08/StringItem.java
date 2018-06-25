package session05.part02.excercies08;

public class StringItem implements Item {
    public String value;
    public StringItem(String value){
        this.value=value;
    }

    @Override
    public Item clone() {
        return null;
    }
    @Override
    public String toString() {
        return "Value : "+value;
    }
}
