package com.higgsup.intern.w01.sec05.part01;

public class DateAndTime {
    private int month; // 1-12
    private int day;   // 1-31 based on month
    private int year;  // any year
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        System.out.printf("MyDate object constructor for date and time: %02d:%02d:%02d | %d/%d/%d \n", getHour(), getMinute(), getSecond(), month, day, year);
    }

    public void setTime(int h, int m, int s) {
        setHour(h);   // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
    }

    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);
    }


    public void setSecond(int s) {
        second = ((s >= 0 && s < 60) ? s : 0);
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

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d" + " | " + "%d/%d/%d", getHour(), getMinute(), getSecond(), month, day, year);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));

    }

    public void tick() {
        if (second < 59) {
            second++;
        } else {
            incrementMinute();
            second = 0;
        }
    }

    public void incrementMinute() {
        if (minute < 59) {
            minute++;
        } else {
            incrementHour();
            minute = 0;
        }
    }

    public void incrementHour() {
        hour++;
        if (hour == 24) {
           setHour(hour);
           nextDay();
        }
    }
    private void nextDay() {
        day++;
        if (check_day(day) == 1) {
            day = check_day(day);
            month++;
            if (checkMonth(month) == 1) {
                month = checkMonth(month);
                year++;
            }
        }
    }

    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) { // validate month
            return testMonth;
        } else { // month is invalid
            System.out.printf("Invalid month (%d) set to ", testMonth);
            return 1; // maintain object in consistent state
        }
    }

    private int check_day(int testDay) {
        int daysPerMonth[] =
                {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check if day in range for month
        if (testDay > 0 && testDay <= daysPerMonth[month]) {
            return testDay;
        }

        // check for leap year
        if (month == 2 && testDay == 29 && (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))) {
            return testDay;
        }
        System.out.printf("Invalid day (%d) set to 1.", testDay);
        return 1;  // maintain object in consistent state
    }

}

