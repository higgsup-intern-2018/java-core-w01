package session03.web_exercies;
/*
* What does the following code fragment do?
    boolean a = false;
    if (a = true) System.out.println("yes");
    else          System.out.println("no");
* */
public class Question71 {
    public static void main(String[] args) {
        boolean a = false;
        if (a == true) System.out.println("yes"); //Chuyển thành == hoặc có thể dùng !a
        else          System.out.println("no");
    }
}

