package com.higgsup.intern.w01.sec03.web;

public class Exercise56 {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int D = Integer.parseInt(args[1]);
        if((M == 12 && D >=22 && D <=31) || (M == 1 && D >=1 && D <=19)){
            System.out.println("Capricorn");
        }
        if((M == 1 && D >=20 && D <=31) || (M == 2 && D >=1 && D <=17)){
            System.out.println("Aquarius");
        }
        if((M == 2 && D >=18 && D <=29) || (M == 3 && D >=1 && D <=19)){
            System.out.println("Pisces");
        }
        if((M == 3 && D >=20 && D <=31) || (M == 4 && D >=1 && D <=19)){
            System.out.println("Aries");
        }
        if((M == 4 && D >=20 && D <=30) || (M == 5 && D >=1 && D <=20)){
            System.out.println("Taurus");
        }
        if((M == 5 && D >=21 && D <=31) || (M == 6 && D >=1 && D <=20)){
            System.out.println("Gemini");
        }
        if((M == 6 && D >=21 && D <=30) || (M == 7 && D >=1 && D <=22)){
            System.out.println("Cancer");
        }
        if((M == 7 && D >=23 && D <=31) || (M == 8 && D >=1 && D <=22)){
            System.out.println("Leo");
        }
        if((M == 8 && D >=23 && D <=31) || (M == 9 && D >=1 && D <=22)){
            System.out.println("Virgo");
        }
        if((M == 9 && D >=23 && D <=30) || (M == 10 && D >=1 && D <=22)){
            System.out.println("Libra");
        }
        if((M == 10 && D >=23 && D <=31) || (M == 11 && D >=1 && D <=21)){
            System.out.println("Scorpio");
        }
        if((M == 11 && D >=22 && D <=30) || (M == 12 && D >=1 && D <=21)){
            System.out.println("Aquarius");
        }
    }
}
