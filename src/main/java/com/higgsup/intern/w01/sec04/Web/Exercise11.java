/*weight class              from    to
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
Super Heavy Weight         209  */

package com.higgsup.intern.w01.sec04.Web;

public class Exercise11 {
    public static void main(String[] args) {
        int w = Integer.parseInt(args[0]);
        int[] weight= {
                112, 115, 118, 122, 126, 130, 135, 140, 147,
                154, 160, 167, 174, 183, 189, 198, 209
        };

        String[] weightClass = {
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

        for (int i = 0; i < weight.length; i++) {
            if (w < weight[i]) {
                System.out.println(weightClass[i]);
                break;
            }
        }
    }
}
