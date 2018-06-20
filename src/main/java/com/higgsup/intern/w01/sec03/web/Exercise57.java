package com.higgsup.intern.w01.sec03.web;

public class Exercise57 {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args [0]);

        switch (weight){
            case 112:
            case 113:
            case 114:
                System.out.println("Class: super flyweight");
                break;

            case 115:
            case 116:
            case 117:
                System.out.println("Class: Bantam weight");
                break;

            case 118:
            case 119:
            case 120:
            case 121:
                System.out.println("Class: Super Bantam weight");
                break;

            case 122:
            case 123:
            case 124:
            case 125:
                System.out.println("Class: Featherweight");
                break;
        }
    }
}
