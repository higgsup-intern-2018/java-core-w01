package com.higgsup.intern.w01.sec02.web;

public class Exercise21
{
    public static void main(String[] args) {
        double declination = Double.parseDouble(args[0]);
        double hourAngle = Double.parseDouble(args[1]);
        double latitude = Double.parseDouble(args[2]);

        double altitude = Math.asin(Math.sin(latitude) * Math.sin(declination) +
                                    Math.cos(latitude) * Math.cos(declination) * Math.cos(hourAngle));

        double azimuth = Math.acos((Math.cos(latitude) * Math.sin(declination) -
                                    Math.sin(latitude) * Math.cos(declination) * Math.cos(hourAngle)) / Math.cos(altitude));
        System.out.println("Position in horizontal coordinates:  Altitude: " + altitude + ", Azimuth: " + azimuth);

    }
}
