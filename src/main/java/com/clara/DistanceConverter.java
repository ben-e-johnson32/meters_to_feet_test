package com.clara;

import java.util.Scanner;

public class DistanceConverter
{
    public static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        // write your code here

        System.out.print("Please type in a distance in meters: ");
        double meters = numberScanner.nextDouble();

        double feet = metersToFeet(meters);

        System.out.println(meters + " meters = " + feet + " feet");

        // End of your code here
        numberScanner.close();
    }


    public static double metersToFeet(double meters)
    {
        //To convert meters to feet, multiply by 3.28084
        return meters * 3.28084;
    }

    // I know doubles would be more real world but we are keeping it simple
    // int values are a little easier to test - doubles/float are not as precise
}
