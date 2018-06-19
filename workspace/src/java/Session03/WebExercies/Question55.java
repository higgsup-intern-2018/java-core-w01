package java.Session03.WebExercies;

import java.util.Scanner;

/*
*55. Write a program Season.java that takes two command line integers M and D
*and prints the season corresponding to month M (1 = January, 12 = December) and day
* D in the northern hemisphere. Use the following table
* */
public class Question55 {
    public static void main(String[] args) {
        int d ,m;
        String season = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input day :");
        d=sc.nextInt();
        System.out.println("Input month");
        m=sc.nextInt();
        if(1 <= m && m <= 3){
            season = "Winter";
            if((m == 3) && (21 <= d))
                season = "Spring";
        } else if (4 <= m && m <=6){
            season = "Spring";
            if((m == 6) && (21 <= d))
                season = "Summer";
        } else if (7 <=m && m <=9){
            season = "Summer";
            if((m == 9) && (21 <= d))
                season = "Fall";
        } else if (10 <= m && m <= 12){
            season = "Fall";
            if((m == 12) && (21 <= d))
                season = "Winter";
        }
        System.out.println("Season is : "+season);
        }
    }

