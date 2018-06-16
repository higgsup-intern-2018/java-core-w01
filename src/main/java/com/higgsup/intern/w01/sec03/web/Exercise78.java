package com.higgsup.intern.w01.sec03.web;

public class Exercise78
{
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        double height = Double.parseDouble(args[1]);

        double bmi = weight / Math.pow(height, 2);

        if(bmi >= 40)
        {
            System.out.println("BMI category: Morbidly Obese");
        }else if(bmi >= 30)
        {
            System.out.println("BMI category: Obese");
        }else if(bmi >= 25)
        {
            System.out.println("BMI category: Overweight");
        }else if(bmi >= 18.5)
        {
            System.out.println("BMI category: Ideal");
        }else if(bmi >= 17.5)
        {
            System.out.println("BMI category: Underweight");
        }else if(bmi >= 15)
        {
            System.out.println("BMI category: Anorexic");
        }else
            {
                System.out.println("BMI category: Starvation");
            }
    }
}
