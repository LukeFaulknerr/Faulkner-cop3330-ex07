/*
    UCF COP3330 Fall 2021 Assignment 7 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex07 {

    // Conversion Factor
    static double conversion = 0.09290304;

    public static void main(String[] args) {

        // Variables / Objects
        Scanner readDimensions = new Scanner(System.in);
        String lengthStr, widthStr;

        // Prompt
        System.out.print("What is the length of the room in feet? ");
        lengthStr = readDimensions.nextLine();
        double length = Double.parseDouble(lengthStr);

        System.out.print("What is the width of the room in feet? ");
        widthStr = readDimensions.nextLine();
        double width = Double.parseDouble(widthStr);

        // Calculations
        int areaFt = (int)(length * width);
        double areaM = Math.round((double)(areaFt)) * conversion;

        // Output
        System.out.println("You entered dimensions of " + lengthStr + " feet by " + widthStr + " feet.");
        System.out.println("The area is");
        System.out.println(areaFt + " square feet");
        System.out.print(areaM + " square meters");
    }
}
