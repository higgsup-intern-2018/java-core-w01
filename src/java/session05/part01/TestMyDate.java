package session05.part01;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate day = new MyDate(6, 6, 2000);
        for(int i = 0; i < 500; i++){
            day.nextDay();
            System.out.println(day);
        }
    }
}
