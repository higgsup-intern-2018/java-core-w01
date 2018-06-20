package session03.web_exercies;

import java.util.Scanner;

public class Question78 {
    /*
    *Body mass index. The body mass index (BMI) is the ratio of the weight of a person (in kilograms) to the square of the height (in meters). Write a program BMI.java that takes two command-line arguments, weight and height, computes the BMI, and prints the corresponding BMI category:
        Starvation: less than 15
        Anorexic: less than 17.5
        Underweight: less than 18.5
        Ideal: greater than or equal to 18.5 but less than 25
        Overweight: greater than or equal to 25 but less than 30
        Obese: greater than or equal to 30 but less than 40
        Morbidly Obese: greater than or equal to 40
    * */
    public static void main(String[] args) {
        double weight ,height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weigth :");
        weight=sc.nextInt();
        System.out.println("Input heigth :");
        height=sc.nextInt();
        double bmi = (weight) / (height * height);
        if (bmi < 15) {
            System.out.println("Starvation");
        } else if (bmi < 17.5) {
            System.out.println("Anorexic");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Ideal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("Obese");
        } else if (bmi >= 40) {
            System.out.println("Morbidly Obes");
        }
    }
}
