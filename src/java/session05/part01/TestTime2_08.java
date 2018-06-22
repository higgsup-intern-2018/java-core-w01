package session05.part01;

public class TestTime2_08 {
    public static void main(String[] args) {
        Time2_08 time = new Time2_08(12,59,59);
        time.tick();
        System.out.println(time.toUniversalString());
        time.toUniversalString();
        time.incrementMinute();
        time.incrementHour();
    }
}
