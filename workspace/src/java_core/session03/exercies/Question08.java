package session03.exercies;

import java.util.Scanner;

/*
* Rewrite TenHellos.java to make a program Hellos.java that takes the number of lines to print as a command-line argument.
 * You may assume that the argument is less than 1000. Hint: consider using i % 10 and i % 100 to determine whether
  * to use "st", "nd", "rd", or "th" for printing the ith Hello.
* */
public class Question08 {
    /*
    *8.Rewrite TenHellos.java to make a program Hellos.java that takes the number of lines to print as a command-line argument.
    *You may assume that the argument is less than 1000.
    *Hint: consider using i % 10 and i % 100 to determine whether to use "st", "nd", "rd", or "th" for printing the ith Hello.
    * */
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n :");
        n=sc.nextInt();
        if ((n%100>=11)&&(n%100<=20))
        {
            System.out.println(n +" th");
        }else if ( n%10==1)
        {
            System.out.println(n +" st");
        }else if(n%10==2)
        {
            System.out.println(n +" nd");
        }else if (n%10==3)
        {
            System.out.println(n +" rd");
        }else
        {
            System.out.println(n +" th");
        }
        System.out.println("Hello !");
    }
}
