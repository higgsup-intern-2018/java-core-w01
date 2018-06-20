package session03.web_exercies;

public class Question72 {
    /*
    * What does the following code fragment do?
        int a = 17, x = 5, y = 12;
        if (x > y);
        {
            a = 13;
            x = 23;
        }
        System.out.println(a);
    * */
    public static void main(String[] args) {
        int a = 17, x = 5, y = 12;
        if (x > y) ;// dấu chấm phẩy giả
        {
            a = 13;
            x = 23;
        }
        System.out.println(a);//Luôn in 13 vì có dấu chấm phẩy giả sau câu lệnh if.
    }
}
