package com.higgsup.intern.w01.OOP_Part01;

public class Time2_Exercise06 {

    private int numberSecond; // 0 - 59

    // Time2_Exercise06 no-argument constructor: initializes each instance variable
    // to zero; ensures that Time2_Exercise06 objects start in a consistent state
    public Time2_Exercise06() {
        this(0, 0, 0); // invoke Time2_Exercise06 constructor with three arguments
    } // end Time2_Exercise06 no-argument constructor

    // Time2_Exercise06 constructor: hour supplied, minute and second defaulted to 0
    public Time2_Exercise06(int h) {
        this(h, 0, 0); // invoke Time2_Exercise06 constructor with three arguments
    } // end Time2_Exercise06 one-argument constructor

    // Time2_Exercise06 constructor: hour and minute supplied, second defaulted to 0
    public Time2_Exercise06(int h, int m) {
        this(h, m, 0); // invoke Time2_Exercise06 constructor with three arguments
    } // end Time2_Exercise06 two-argument constructor

    // Time2_Exercise06 constructor: hour, minute and second supplied
    public Time2_Exercise06(int h, int m, int s) {
        setTime(h, m, s); // invoke setTime to validate time
    } // end Time2_Exercise06 three-argument constructor

    // Time2_Exercise06 constructor: another Time2_Exercise06 object supplied
    public Time2_Exercise06(Time2_Exercise06 time) {
        // invoke Time2_Exercise06 three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    } // end Time2_Exercise06 constructor with a Time2_Exercise06 object argument

    // Set Methods
    // set a new time value using universal time; ensure that
    // the data remains consistent by setting invalid values to zero
    public void setTime( int h, int m, int s )
    {
        if ( (( h >= 0) && (h < 24 )) )
            numberSecond = h * 60 * 60;
        else
            numberSecond = 0;

        if ( (( m >= 0) && (m < 60 )) )
            numberSecond += m * 60;

        if ( (( s >= 0) && (s < 60 )) )
            numberSecond += s;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return numberSecond/3600;
    } // end method getHour

    // get minute value
    public int getMinute() {
        return  numberSecond % 3600 / 60;
    } // end method getMinute

    // get second value
    public int getSecond() {
        return numberSecond % 60;
    } // end method getSecond

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } // end method toUniversalString

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } // end method toString
}
    
