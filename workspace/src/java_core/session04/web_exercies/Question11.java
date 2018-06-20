package session04.web_exercies;

import java.util.Scanner;

public class Question11 {
    /*
    * 11.Thai kickboxing. Write a program KickBoxer.java that takes an integer weight w as a command line input and prints the corresponding kickboxing weight-class according to the table below.
    *   weight class              from    to
        ------------------------------------
        Fly Weight                   0   112
        Super Fly Weight           112   115
        Bantam Weight",            115   118
        Super Bantam Weight        118   122
        Feather Weight             122   126
        Super Feather Weight       126   130
        Light Weight               130   135
        Super Light Weight         135   140
        Welter Weight              140   147
        Super Welter Weight        147   154
        Middle Weight              154   160
        Super Middle Weight        160   167
        Light Heavy Weight         167   174
        Super Light Heavy Weight   174   183
        Cruiser Weight             183   189
        Super Cruiser Weight       189   198
        Heavy Weight               198   209
        Super Heavy Weight         209
     * */
    public static void main(String[] args) {
        int w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input w :");
        w = sc.nextInt();
        int[] weigths = {112, 115, 118, 122, 126, 130, 135, 140, 147,
                        154, 160, 167, 174, 183, 189, 198, 209, 9999};
        String[] type = {
                "Fly Weight",
                "Super Fly Weight",
                "Bantam Weight",
                "Super Bantam Weight",
                "Feather Weight",
                "Super Feather Weight",
                "Light Weight",
                "Super Light Weight",
                "Welter Weight",
                "Super Welter Weight",
                "Middle Weight",
                "Super Middle Weight",
                "Light Heavy Weight",
                "Super Light Heavy Weight",
                "Cruiser Weight",
                "Super Cruiser Weight",
                "Heavy Weight",
                "Super Heavy Weight"
        };
        for (int i =0;i<weigths.length;i++)
        {
            if ( w <weigths[i])
            {
                System.out.println(type[i]);
                break;
            }
        }
    }
}
