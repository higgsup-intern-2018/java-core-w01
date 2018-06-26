package com.higgsup.intern.w01.oop_part01;

public class GradeBook {
    private String courseName;
    private String instructorName;

    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public void setCourseName(String name) {
        courseName = name;
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

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for "+getCourseName()+"\n");
        System.out.printf("This course is presented by: "+getInstructorName());
    }

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook("English","Hai Anh");
        gradeBook.displayMessage();
    }
}
