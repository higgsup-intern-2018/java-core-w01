package java.Session02.Exercises;

import java.util.Scanner;

public class Question23 {
    /*
    *23. Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
    * Viết một chương trình SpringSeason.java lấy hai giá trị int m và d , in ra true nếu d của tháng
    * m là từ giữa ngày 20 tháng 3 đến ngày 20 tháng 6.
    * */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int month,day ;
        System.out.println("Input date : ");
        day =sc.nextInt();
        System.out.println("Input month :");
        month=sc.nextInt();
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >=  1 && day <= 30) || (month == 5 && day >=  1 && day <= 31) || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}
