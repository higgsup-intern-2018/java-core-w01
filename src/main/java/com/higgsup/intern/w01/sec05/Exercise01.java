package com.higgsup.intern.w01.sec05;

public class Exercise01 {
    private String courseName;

    public Exercise01(String name){
        courseName = name;
    }

    public void setCourseName(String name){
        courseName = name;
    }

    public String getCourseName(){
        return courseName;
    }

    public void displayMessage(){
        System.out.println("Welcome to the grade book: "+getCourseName());
    }

    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01("PHP");
        exercise01.displayMessage();

    }
}
