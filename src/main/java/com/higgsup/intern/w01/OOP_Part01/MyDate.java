package com.higgsup.intern.w01.oop_part01;

public class MyDate {
    private int month; // 1-12
    private int day;   // 1-31 based on month
    private int year;  // any year

    // constructor: call checkMonth to confirm proper value for month;
    // call checkDay to confirm proper value for day
    public MyDate(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth); // validate month
        year = theYear; // could validate year
        day = checkDay(theDay); // validate day

        System.out.printf("MyDate object constructor for date %s\n", this);
    } // end MyDate constructor

    // utility method to confirm proper month value
    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) { // validate month
            return testMonth;
        } else { // month is invalid
            System.out.printf("Invalid month (%d) set to 1.", testMonth);
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

        System.out.printf("Invalid day (%d) set to 1.", testDay);

        return 1;  // maintain object in consistent state
    } // end method checkDay

    public void nextDay(){
        if(day == 31 && month == 12){
            day = 1; month = 1; year = year+1;
        }
        else if((day == 31 &&(month == 1 || month == 3 || month == 5 ||month == 7 || month == 8 || month == 10))
         ||(day == 30 &&(month == 4 || month == 6 || month == 9||month == 11))
         ||(day == 29 && month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))){
            day = 1; month += 1;
        } else day +=1;
        System.out.printf("My next date %s\n", this);
    }

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
