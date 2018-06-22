package session05.part01;

public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int theMonth, int theDay, int theYear)
    {
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);
        System.out.printf("MyDate object constructor for date : %s  \n", this);
    }

    private int checkMonth(int testMonth)
    {
        if (testMonth > 0 && testMonth <= 12)
        {
            return testMonth;
        }
        else
        {
            //System.out.printf("Invalid month (%d) set to 1.", testMonth);
            return 1;
        }
    }

    private int checkDay(int testDay)
    {
        int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (testDay > 0 && testDay <= daysPerMonth[month])
        {
            return testDay;
        }
        if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            return testDay;
        }
        System.out.printf("Invalid day (%d) set to : ", testDay);
        return 1;
    }

    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }

    public void nextDay() {
        day ++;
        if (checkDay(day) == 1)
        {
            day=checkDay(day);
            month++;
        }
        if (month == 13)
        {
            month=checkMonth(month);
            year++;
        }
    }

}
