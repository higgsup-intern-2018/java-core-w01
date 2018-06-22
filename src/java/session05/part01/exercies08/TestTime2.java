package session05.part01.exercies08;

public class TestTime2 {
    public static void main(String[] args) {
        Time2 time = new Time2(12,59,59);
        time.tick();
        System.out.println(time.toUniversalString());
        time.toUniversalString();
        time.incrementMinute();
        time.incrementHour();
    }
}
