package session05.part01;

public class GradeBook {
    private String couresName;
    private String lecturerName;
    public GradeBook(String name , String nameLecturer){
        couresName=name;
        lecturerName=nameLecturer;
    }
    public void setCouresName(String name){
        couresName=name;
    }

    public String getCouresName() {
        return couresName;
    }
    public void setLecturerName(String nameLecturer){
        lecturerName=nameLecturer;
    }

    public String getLecturerName() {
        return lecturerName;
    }
    public void displayMessage(){
        System.out.println("Welcome to the grade book for " +couresName + " by lecturers "+lecturerName+" teaching");
    }
}
