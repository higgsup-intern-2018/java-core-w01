package com.higgsup.intern.w01.sec05;

public class GradeBook
{
    private String courseName; // course name for this GradeBook
    private String courseInstructor;    //course instructor

    // constructor initializes courseName with String supplied as argument
    // modified to specify two parameters for course name and instructor name
    public GradeBook(String name, String instructor) {
        courseName = name; // initializes courseName
        courseInstructor = instructor;  //initializes courseInstructor
    } // end constructor

    // method to set the course name
    public void setCourseName(String name) {
        courseName = name; // store the course name
    } // end method setCourseName

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
    } // end method getCourseName

    //method to set the course instructor
    public void setCourseInstructor(String instructor) {
        courseInstructor = instructor;
    }

    //method to retrieve the course instructor
    public String getCourseInstructor(){
        return courseInstructor;
    }

    // display a welcome message to the GradeBook user
    // modified output message
    public void displayMessage() {
        // this statement calls getCourseName to get the
        // name of the course this GradeBook represents
        System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
        System.out.println("This course is presented by: " + getCourseInstructor());
    } // end method displayMessage

    //Test application
    public static void main(String[] args) {
        GradeBook exDemo= new GradeBook("JAVA", "Kev");
        exDemo.displayMessage();
    }
}
