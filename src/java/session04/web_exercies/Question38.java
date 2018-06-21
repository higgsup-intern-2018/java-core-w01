package session04.web_exercies;

import java.util.Random;

public class Question38 {
    /*
    *38. Write a program Yahtzee.java that simulates the rolling of five dice and
     * prints "Yahtzee" if all five dice are the same; otherwise it should print "Try again."
    * */
    public static void main(String[] args) {
       int[] dice = new int[5];
        Random rd = new Random();
        //random lấy giá trị của 5 xúc xắc
        for (int i = 0; i < 5; i++) {
            dice[i] = rd.nextInt(6) + 1;
        }

        //hiển thị kết quả
        for (int i = 0; i < 5; i++) {
            System.out.print("\nRoll " + (i+1) + " : " );
            System.out.print(" " + dice[i] );
        }
        System.out.println();

        for (int i = 1; i < 5; i++) //So sanh
        {
            if (dice[i] == dice[i+1] && dice[i]==dice[i+2] && dice[i]==dice[i+3]&&dice[i]==dice[i+4])
            {
                System.out.println("Yahtzee");
                break;
            }
            else
            {
                System.out.println("Try again");
                break;
            }
        }
    }
}
