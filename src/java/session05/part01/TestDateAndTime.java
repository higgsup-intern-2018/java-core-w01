package session05.part01;

public class TestDateAndTime {
    public static void main(String[] args) {
        DateAndTime dat = new DateAndTime(1999, 11, 05, 17, 30, 34);
        for(int i = 0; i <60; i++)
        {
            dat.tick();
            System.out.println(dat.toString());
        }
    }
}
