package com.higgsup.intern.w01.sec03.web;

public class Exercise57
{
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);

        switch (weight)
        {
            case 112: case 113: case 114:
            System.out.println("Weight class: Super flyweight");
            case 115: case 116: case 117:
            System.out.println("Weight class: Bantamweight");
            case 118: case 119: case 120: case 121:
            System.out.println("Weight class: Super bantamweight");
            case 122: case 123: case 124: case 125:
            System.out.println("Weight class: Featherweight");
            case 126: case 127: case 128: case 129:
            System.out.println("Weight class: Super featherweight");
            case 130: case 131: case 132: case 133: case 134:
            System.out.println("Weight class: Lightweight");
            case 135: case 136: case 137: case 138: case 139:
                System.out.println("Weight class: Super lightweight");
            case 140: case 141: case 142: case 143: case 144: case 145: case 146:
            System.out.println("Weight class: Welterweight");
            case 147: case 148: case 149: case 150: case 151: case 152: case 153:
            System.out.println("Weight class: Superwelterweight");
            case 154: case 155: case 156: case 157: case 158: case 159:
            System.out.println("Weight class: Middleweight");
            case 160: case 161: case 162: case 163: case 164: case 165: case 166:
            System.out.println("Weight class: Super middleweight");
            case 167: case 168: case 169: case 170: case 171: case 172: case 173: case 174:
            System.out.println("Weight class: Light heavyweight");
            case 175: case 176: case 177: case 178: case 179: case 180: case 181: case 182:
            System.out.println("Weight class: Super light heavyweight");
            case 183: case 184: case 185: case 186: case 187: case 188: case 189:
            System.out.println("Weight class: Cruiserweight");
        }
    }
}
