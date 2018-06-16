package com.higgsup.intern.w01.sec03.web;

public class Exercise56
{
    public static void main(String[] args)
    {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        String zodiacSign = "";
        if((month == 12 && day > 21) || (month == 1 && day < 20))
        {
            zodiacSign = "Capricorn";
        }
        if((month == 1 && day > 19) || (month == 2 && day < 18))
        {
            zodiacSign = "Aquarius";
        }
        if ((month == 2 && day > 17) || (month == 3 && day < 20))
        {
            zodiacSign = "Pisces";
        }
        if((month == 3 && day > 19) || (month == 4 && day < 20))
        {
            zodiacSign = "Aries";
        }
        if ((month == 4 && day > 19) || (month == 5 && day < 21))
        {
            zodiacSign = "Taurus";
        }
        if((month == 5 && day > 20) || (month == 6 && day < 21))
        {
            zodiacSign = "Gemini";
        }
        if ((month == 6 && day > 20) || (month == 7 && day < 23))
        {
            zodiacSign = "Cancer";
        }
        if((month == 7 && day > 22) || (month == 8 && day < 23))
        {
            zodiacSign = "Leo";
        }
        if((month == 8 && day > 22) || (month == 9 && day < 23))
        {
            zodiacSign = "Virgo";
        }
        if((month == 9 && day > 22) || (month == 10 && day < 23))
        {
            zodiacSign = "Libra";
        }
        if((month == 10 && day > 22) || (month == 11 && day < 22))
        {
            zodiacSign = "Scorpio";
        }
        if((month == 11 && day > 21) || (month == 12 && day < 22))
        {
            zodiacSign = "Sagittarius";
        }
        System.out.println("Zodiac sign: " + zodiacSign);
    }
}
