package session05.part02.excercies08;

public class NumerallItem implements Item{
    private int value;

    public NumerallItem(int value) {
        this.value = value;
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
