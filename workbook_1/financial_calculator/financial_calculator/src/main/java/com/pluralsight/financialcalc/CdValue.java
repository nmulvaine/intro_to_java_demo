package com.pluralsight.financialcalc;

import java.util.Scanner;

public class CdValue {

    public void cdCalc() {

        //Get user information

        Scanner getUserInput = new Scanner(System.in);
        System.out.print("To calculate your Certificate of Deposit, please provide the following.\n");
        System.out.println("Total Deposit Amount:\n");
        double cdAmount = getUserInput.nextDouble();
        System.out.print("Length of CD in Years:\n");
        double lengthYears = getUserInput.nextDouble();
        System.out.print("Interest Rate:\n");
        double cdRate = getUserInput.nextDouble();
        System.out.print("Thank you. We will now calculate your future value\n" +
                "and also the total interest earned over the length of the CD");


        //Conversions
        //double lengthDays = lengthYears * 365;


        // Calculations
        int y = 365;
        double futureValue = cdAmount * Math.pow(1 + (cdRate / 100) / y, y * lengthYears);
        double totalInterest = futureValue - cdAmount;


        //Display Results
        System.out.println("The future value of the CD is " + String.format("%.2f", futureValue));
        System.out.println("The total interest earned will be " + String.format("%.2f", totalInterest));




    }
}
