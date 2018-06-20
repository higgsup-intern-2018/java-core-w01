package session04.exercies;

public class Question11 {
    /*
    * 11 .Write a program HowMany.java that takes a variable number of command-line arguments and prints how many there are
    * Viết một chương trình HowMany.java lấy số lượng các dòng và in ra.
    **/
    public static void main(String[] args) {
        System.out.print("You entered " + args.length + " command-line argument");
        if (args.length == 1)
        {
            System.out.println(".");
        }
        else
        {
            System.out.println("s.");
        }
    }
}
