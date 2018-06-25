/*Modify class MyDate to perform error checking on the initializer values for instance variables month, day and year
(currently it validates only the month and day). Provide a method nextDay to increment the day by one.
The Date object should always remain in a consistent state. Write a program that tests the nextDay method in a loop
that prints the date during each iteration of the loop to illustrate that the nextDay method works correctly. Test the following cases:

incrementing into the next month and
incrementing into the next year.*/
package com.higgsup.intern.w01.sec05;

public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int theMonth, int theDay, int theYear) {// truyen constructor có tham số
        month = checkMonth(theMonth); // phương thức checkMonth
        day = checkDay(theDay);       // phương thức checkDay
        year = checkYear(theYear);   // phương thức checkYear
    }

    private int checkYear(int testYear) {
        if (testYear > 0) {
            return testYear;
        } else {
            System.out.println("TestYear: "+testYear);
            return 1;
        }
    }

    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12){
            return testMonth;
        } else {
            System.out.printf("TestMonth:"+testMonth);
            return 1;
        }
    }

    private int checkDay(int testDay) {
        int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (testDay > 0 && testDay <= daysPerMonth[month]) {
            return testDay;
        }
        if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            return testDay;
        }
        return 1;
    }

    public void nextDay() { //
        day = day +1;  /* tăng ngày lên 1 , ví dụ nhập ngày 31 thì nó tăng lên 1 là 32, nhưng 32 là sai thì nó sẽ trả về giá trị
        1 và tăng tháng lên 1 */
        if (checkDay(day) == 1) {
            day = checkDay(day);
            month = month+1;
        }
        if (month == 13) {
            month = checkMonth(month);
            year = year+1;
        }
    }

    public String toString() {
        return String.format("%d%d%d",day,month, year);
    }

    public static void main(String[] args) {
        MyDate mydate = new MyDate(12, 13, 2018);
        for (int i = 0; i < 60; i++) {
            mydate.nextDay();
            System.out.println(mydate);
        }
    }
}
