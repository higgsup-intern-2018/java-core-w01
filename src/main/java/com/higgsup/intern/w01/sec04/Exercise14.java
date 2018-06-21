package com.higgsup.intern.w01.sec04;

public class Exercise14
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int[][] squareArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                squareArray[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        System.out.println("Before transpose: ");
        for(int i = 0; i < squareArray.length; i++)
        {
            for(int j = 0; j < squareArray.length; j++)
            {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                squareArray[i][j] = squareArray[i][j] - squareArray[j][i];
                squareArray[j][i] = squareArray[j][i] + squareArray[i][j];
                squareArray[i][j] = squareArray[j][i] - squareArray[i][j];
            }
        }

        System.out.println("After transpose");
        for(int i = 0; i < squareArray.length; i++)
        {
            for(int j = 0; j < squareArray.length; j++)
            {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
