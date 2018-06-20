package session03.web_exercies;

import java.util.Scanner;

public class Question08 {
    /*
    *Write a program Hurricane.java that that takes the wind speed (in miles per hour) as an integer
    * command-line argument and prints whether it qualifies as a hurricane, and if so,
     *whether it is a Category 1, 2, 3, 4, or 5 hurricane.
    * Below is a table of the wind speeds according to the Saffir-Simpson scale.
    * */
    public static void main(String[] args) {
        int wind ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input wind : ");
        wind = sc.nextInt();
        if(wind<65)
        { System.out.println("Not a hurricane");

        }else if (wind<96)
        {
            System.out.println(" 1 hurricane");
        }
        else if (wind <111)
        {
            System.out.println(" 2 hurricane");
        }
        else if (wind<131)
        {
            System.out.println(" 3 hurricane");
        }
        else if (wind<155)
        {
            System.out.println(" 4 hurricane");
        }
        else
        {
            System.out.println(" 5 hurricane");
        }
    }
}

