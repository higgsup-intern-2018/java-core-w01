package com.higgsup.intern.w01.sec05.part01;

public class GradeBook {
    private String courseName;
    private String instructorName;

    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }
    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    // display a welcome message to the GradeBook user
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!\n", getCourseName());
        System.out.printf("This course is presented by: %s!\n", getInstructorName());
    }

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook("Java Core", "Mr. Titus");
        gradeBook.displayMessage();
    }
}
