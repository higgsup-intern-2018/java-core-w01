package com.higgsup.intern.w01.sec03.web;

public class Exercise57 {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        String classify = "";
        if (weight >= 0 && weight < 112) System.out.println("Flyweight");
        if (weight >= 112 && weight < 115) System.out.println("Super flyweight");
        if (weight >= 115 && weight < 118) System.out.println("Bantamweight");
        if (weight >= 118 && weight < 122) System.out.println("Super bantamweight");
        if (weight >= 122 && weight < 126) System.out.println("Featherweight");
        if (weight >= 126 && weight < 130) System.out.println("Super featherweight");
        if (weight >= 130 && weight < 135) System.out.println("Lightweight");
        if (weight >= 135 && weight < 140) System.out.println("Super lightweight");
        if (weight >= 140 && weight < 147) System.out.println("Welterweight");
        if (weight >= 147 && weight < 154) System.out.println("Super welterweight");
        if (weight >= 154 && weight < 160) System.out.println("Middleweight");
        if (weight >= 160 && weight < 167) System.out.println("Super middleweight");
        if (weight >= 167 && weight < 175) System.out.println("Light heavyweight");
        if (weight >= 175 && weight < 183) System.out.println("Super light heavyweight");
        if (weight >= 183 && weight < 190) System.out.println("Cruiserweight");
        if (weight >= 190 && weight < 220) System.out.println("Heavyweight");
        if (weight >= 220 ) System.out.println("Super heavyweight");
    }
}
