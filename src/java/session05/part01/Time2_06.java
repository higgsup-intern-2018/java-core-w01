package session05.part01;

public class Time2_06 {
    private int hour;
    private int minute;
    private int second;

    public Time2_06() {
        this(0, 0, 0);
    }

    public Time2_06(int h) {
        this(h, 0, 0);
    }

    public Time2_06(int h, int m) {
        this(h, m, 0);
    }

    public Time2_06(int h, int m, int s) {
        setTime(h, m, s);
    }

    public Time2_06(Time2_06 time) {

        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        second += h * 3600;
    }

    public void setMinute(int m) {
        second += m * 60;
    }

    public void setSecond(int s) {
        second += s;
    }

    public int getHour() {
        return (second / 3600);
    }

    public int getMinute() {
        return (second - getHour() * 3600) / 60;
    }

    public int getSecond() {
        return (second - getHour() * 3600 - getMinute() * 60);
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
