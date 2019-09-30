package com.mycompany.lab3;

import java.text.NumberFormat;
import java.util.Scanner;

public class PaintJobEstimator {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();

        {

            nf.setMaximumFractionDigits(2);

            nf.setMinimumFractionDigits(2);

        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number of rooms:");
        int numberOfRooms = keyboard.nextInt();
        double squareFeet = totalWallArea(numberOfRooms);
        System.out.println("Please enter the price per gallon of paint:");
        double pricePerGallonOfPaint = keyboard.nextDouble();
        double gallonsNeeded = gallonsOfPaintNeeded(squareFeet);
        double totalPriceOfPaint = totalPriceOfPaint(gallonsNeeded, pricePerGallonOfPaint);
        double hoursOfLabor = hoursOfLaborNeeded(squareFeet);
        double totalLaborCosts = totalCostOfLabor(hoursOfLabor);
        double totalCosts = totalCostOfJob(totalLaborCosts, totalPriceOfPaint);
        System.out.println("The Number of Rooms Being Painted is: " + numberOfRooms);
        System.out.println("Gallons of Paint Needed: " + nf.format(gallonsNeeded) + " gallons");
        System.out.println("Total Materials Cost: $" + nf.format(totalPriceOfPaint));
        System.out.println("Labor Hours Required: " + nf.format(hoursOfLabor) + " hours");
        System.out.println("Total Labor Cost: $" + nf.format(totalLaborCosts));
        System.out.println("Total Job Cost: $" + nf.format(totalCosts));

    }

    public static double totalWallArea(double numberOfRooms) {
        Scanner keyboard = new Scanner(System.in);
        double squareFeet = 0;
        int counter = 1;
        while (counter <= numberOfRooms) {
            double currentInput = 0;
            System.out.println("Please enter the square footage of wall space for room " + counter + ":");
            currentInput = keyboard.nextDouble();
            squareFeet = currentInput + squareFeet;
            counter++;
        }
        return squareFeet;
    }

    public static double gallonsOfPaintNeeded(double squareFeet) {
        double gallonsNeeded = squareFeet / 115;
        return gallonsNeeded;
    }

    public static double totalPriceOfPaint(double gallonsNeeded, double priceOfPaint) {
        double totalPriceOfPaint = gallonsNeeded * priceOfPaint;

        return totalPriceOfPaint;
    }

    public static double hoursOfLaborNeeded(double squareFeet) {
        double hoursOfLabor = (squareFeet / 115) * 8;

        return hoursOfLabor;
    }

    public static double totalCostOfLabor(double hoursOfLabor) {
        double totalCostOfLabor = hoursOfLabor * 18.00;
        return totalCostOfLabor;
    }

    public static double totalCostOfJob(double laborCosts, double materialsCost) {
        double totalCost = laborCosts + materialsCost;
        return totalCost;
    }
}
