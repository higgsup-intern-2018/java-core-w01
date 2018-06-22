package com.higgsup.intern.w01.OOP_Part01;

public class DateAndTime {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    private int month; // 1-12
    private int day;   // 1-31 based on month
    private int year;  // any year

    public DateAndTime(int h, int m, int s,int theMonth, int theDay, int theYear){
        setHour(h);   // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
        month = checkMonth(theMonth); // validate month
        year = theYear; // could validate year
        day = checkDay(theDay); // validate day
    }

    public void setTimeAndDate(int h, int m, int s,int theMonth, int theDay, int theYear) {
        setHour(h);   // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
        month = checkMonth(theMonth); // validate month
        year = theYear; // could validate year
        day = checkDay(theDay); // validate day

    } // end method setTime


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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void tick(){
        if(second==59){
            incrementMinute();
            second = 0;
        }else if(second<59){
            second += 1;
        }
    }
    public void incrementMinute(){
        if(minute >=59){
            incrementHour();
            minute = 0;
        }else if(minute<59){
            minute += 1;
        }
    }
    public void incrementHour(){
        if(hour >=23){
            hour = 0;
            this.nextDay();
        } else hour +=1;
    }

    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) { // validate month
            return testMonth;
        } else {
            System.out.printf("Invalid month (%d) set to 1.", testMonth);
            return 1;
        }
    }

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

        System.out.printf("Invalid day (%d) set to 1.", testDay);

        return 1;
    }

    public void nextDay(){
        if(day == 31 && month == 12){
            day = 1; month = 1; year = year+1;
        }
        else if((day == 31 &&(month == 1 || month == 3 || month == 5 ||month == 7 || month == 8 || month == 10))
                ||(day == 30 &&(month == 4 || month == 6 || month == 9||month == 11))
                ||(day == 29 && month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))){
            day = 1; month += 1;
        } else day +=1;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d - %d/%d/%d",this.getHour(),this.getMinute(),this.getSecond(), month, day, year);
    }
}
