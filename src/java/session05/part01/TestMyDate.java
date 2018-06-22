package session05.part01;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate day = new MyDate(1, 1, 2000);
        for(int i = 0; i < 200; i++){
            day.nextDay();
            System.out.println(day);
        }
    }
}
