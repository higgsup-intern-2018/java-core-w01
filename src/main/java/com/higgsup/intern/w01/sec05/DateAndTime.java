package com.higgsup.intern.w01.sec05;

public class DateAndTime
{
    private int month; // 1-12
    private int day;   // 1-31 based on month
    private int year;  // any year
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public DateAndTime(int year, int month, int day, int hour, int minute, int second)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Set Methods
    // set a new time value using universal time; ensure that
    // the data remains consistent by setting invalid values to zero
    public void setTime(int h, int m, int s) {
        setHour(h);   // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
    } // end method setTime

    public void setDate(int d, int m, int y){
        day = checkDay(d);
        month = checkMonth(m);
        year = checkYear(y);
    }

    // validate and set hour
    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    } // end method setHour

    // validate and set minute
    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);
    } // end method setMinute

    // validate and set second
    public void setSecond(int s) {
        second = ((s >= 0 && s < 60) ? s : 0);
    } // end method setSecond

    //method to confirm year value
    private int checkYear(int testYear)
    {
        if (testYear > 0){
            return testYear;
        }else{
            System.out.printf("Invalid year (%d) set to 1.", testYear);
            return 1;
        }
    }

    // utility method to confirm proper month value
    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) { // validate month
            return testMonth;
        } else { // month is invalid
            //System.out.printf("Invalid month (%d) set to 1.", testMonth);
            return 1; // maintain object in consistent state
        } // end else
    } // end method checkMonth

    // utility method to confirm proper day value based on month and year
    private int checkDay(int testDay) {
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

        //System.out.printf("Invalid day (%d) set to 1.", testDay);

        return 1;  // maintain object in consistent state
    } // end method checkDay

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    } // end method getHour

    // get minute value
    public int getMinute() {
        return minute;
    } // end method getMinute

    // get second value
    public int getSecond() {
        return second;
    } // end method getSecond

    //tick method: increment time stored by one second
    public void tick()
    {
        second++;
        if(getSecond() == 60) {
            setSecond(second);
            incrementMinute();
        }
    }

    //incrementMinute method: increment the minute
    public void incrementMinute()
    {
        minute++;
        if(getMinute() == 60){
            setMinute(minute);
            incrementHour();
        }
    }

    //incrementHour method: increment the hour
    public void incrementHour()
    {
        hour++;
        if(getHour() == 24){
            setHour(hour);
            nextDay();
        }
    }

    //increment the day by one
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

    // convert to String in universal-time format (yyyy-mm-dd HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d-%02d-%02d %02d:%02d:%02d", year, month, day, getHour(), getMinute(), getSecond());
    } // end method toUniversalString

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d-%02d-%02d %d:%02d:%02d %s", year, month, day,
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    } // end method toString

    public static void main(String[] args) {
        DateAndTime dat = new DateAndTime(1996, 12, 31, 23, 58, 47);
        for(int i = 0; i < 99; i++)
        {
            dat.tick();
            System.out.println(dat.toString());
        }
    }
}

