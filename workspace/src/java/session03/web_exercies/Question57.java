package session03.web_exercies;

import java.util.Scanner;

public class Question57 {
    /*
    * 57 .Muay Thai kickboxing. Write a program that reads in the weight of a
     *  Muay Thai kickboxer (in pounds) as a command-line argument and prints
     *  their weight class.Use a switch statement.
    * */
    public static void main(String[] args) {
        int weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight : ");
        weight=sc.nextInt();
        int chosse = weight;
        if(1 <= weight && weight <=100) chosse = 1;
        if(112 <= weight && weight <=115) chosse = 2;
        if(115 <= weight && weight <=118) chosse = 3;
        if(118 <= weight && weight <=122) chosse = 4;
        if(122 <= weight && weight <=126) chosse = 5;
        if(126 <= weight && weight <=130) chosse = 6;
        if(130 <= weight && weight <=135) chosse = 7;
        if(135 <= weight && weight <=140) chosse = 8;
        if(140 <= weight && weight <=147) chosse = 9;
        switch (chosse) {
            case 1: {
                System.out.println("Flyweight");
                break;
            }
            case 2: {
                System.out.println("Super flyweight");
                break;
            }
            case 3: {
                System.out.println("Bantamweight");
                break;
            }
            case 4: {
                System.out.println("Super bantamweight");
                break;
            }
            case 5: {
                System.out.println("Featherweight");
                break;
            }
            case 6: {
                System.out.println("Super featherweight");
                break;
            }
            case 7: {
                System.out.println("Lightweight");
                break;
            }
            case 8: {
                System.out.println("Super lightweight");
                break;
            }
            case 9: {
                System.out.println("Welterweight");
                break;
            }
            default: {
                System.out.println("Super heavyweight");
            }
        }
    }
}
