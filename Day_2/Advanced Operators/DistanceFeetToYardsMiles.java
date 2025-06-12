package com.operatorsAdvanced;

import java.util.Scanner;

public class DistanceFeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet;

        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
