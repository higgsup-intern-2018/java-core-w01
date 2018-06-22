package session05.part01;

public class TestTime2_08 {
    public static void main(String[] args) {
        Time2_08 time = new Time2_08(12,59,59);
        time.tick();
        System.out.println(String.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond()));
        time.incrementMinute();
        time.incrementHour();
    }
}
