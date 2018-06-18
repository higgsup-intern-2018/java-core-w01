package com.higgsup.intern.w01.sec03.web;

//Muay Thai kickboxing. Write a program that reads in the weight of a Muay Thai kickboxer (in pounds) as a command-line
// argument and prints their weight class. Use a switch statement.
public class Exercise57 {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        int switchVariable = weight;

        if(1 <= weight && weight <=100) switchVariable = 1;
        if(112 <= weight && weight <=115) switchVariable = 2;
        if(115 <= weight && weight <=118) switchVariable = 3;
        if(118 <= weight && weight <=122) switchVariable = 4;
        if(122 <= weight && weight <=126) switchVariable = 5;
        if(126 <= weight && weight <=130) switchVariable = 6;
        if(130 <= weight && weight <=135) switchVariable = 7;
        if(135 <= weight && weight <=140) switchVariable = 8;
        if(140 <= weight && weight <=147) switchVariable = 9;

        switch (switchVariable) {
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
            } default:{
                System.out.println("Super heavyweight");
            }
        }
        }

    }

