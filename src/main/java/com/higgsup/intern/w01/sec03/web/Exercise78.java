package com.higgsup.intern.w01.sec03.web;

public class Exercise78 {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        double height = Double.parseDouble(args[1]);
        double BMI = weight / (height * height);
        if(BMI <=15) System.out.println("Starvation");
        if(BMI >15 && BMI <=17.5) System.out.println("Anorexic");
        if(BMI >=18.5 && BMI <25) System.out.println("Ideal");
        if(BMI >=25 && BMI <30) System.out.println("Overweight");
        if(BMI >=30 && BMI <40) System.out.println("Obese");
        if(BMI >=40) System.out.println("Morbidly Obese");
    }
}
