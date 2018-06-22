package session05.part01;

public class DateAndTime {
    private int month;
    private int day;
    private int year;
    private int hour;
    private int minute;
    private int second;

    public DateAndTime(int year, int month, int day, int hour, int minute, int second)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int h)
    {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }
    public void setMinute(int m)
    {
        minute = ((m >= 0 && m < 60) ? m : 0);
    }
    public void setSecond(int s)
    {
        second = ((s >= 0 && s < 60) ? s : 0);
    }
    private int checkYear(int testYear)
    {
        if (testYear > 0)
        {
            return testYear;
        }else{
            System.out.printf("Invalid year (%d) set to 1.", testYear);
            return 1;
        }
    }
    private int checkMonth(int testMonth)
    {
        if (testMonth > 0 && testMonth <= 12)
        {
            return testMonth;
        } else {
            System.out.printf("Invalid month (%d) set to 1.", testMonth);
            return 1;
        }
    }
    private int checkDay(int testDay) {
        int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (testDay > 0 && testDay <= daysPerMonth[month])
        {
            return testDay;
        }
        if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            return testDay;
        }
        System.out.printf("Invalid day (%d) set to 1.", testDay);
        return 1;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setDate(int d, int m, int y){
        day = checkDay(d);
        month = checkMonth(m);
        year = checkYear(y);
    }
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void tick()
    {
        second++;
        if(getSecond() == 60) {
            setSecond(second);
            incrementMinute();
        }
    }
    public void incrementMinute()
    {
        minute++;
        if(getMinute() == 60){
            setMinute(minute);
            incrementHour();
        }
    }
    public void incrementHour()
    {
        hour++;
        if(getHour() == 24){
            setHour(hour);
            nextDay();
        }
    }
    public void nextDay()
    {
        day += 1;
        if(checkDay(day) == 1){
            day = checkDay(day);
            month++;
        }

        if(month == 13)
        {
            month = checkMonth(month);
            year++;
        }
    }
    public String toUniversalString()
    {
        return String.format("%02d-%02d-%02d %02d:%02d:%02d", year, month, day, getHour(), getMinute(), getSecond());
    }
    public String toString()
    {
        return String.format("%d-%02d-%02d %d:%02d:%02d %s", year, month, day,
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
