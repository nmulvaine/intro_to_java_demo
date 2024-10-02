package com.pluralsight.financialcalc;
import java.lang.Math;
import java.util.Scanner;


public class Mortgage {
    public void mortgageCalc()
    {

        Scanner getUserInput = new Scanner (System.in);
        System.out.print("To calculate your mortgage, please provide the following.\n");
        System.out.println("Total Loan Value:\n");
        double loanAmount = getUserInput.nextDouble();
        System.out.print("Length of Loan in years:\n");
        double loanLength = getUserInput.nextDouble();
        System.out.print("Interest Rate:\n");
        double interestAmount = getUserInput.nextDouble();
        System.out.print("Thank you. We will now calculate your monthly payment," +
                "and also the cost of your interest over the life of the loan");

        // Conversions
        double monthInterest = (interestAmount / 100) /12;
        double lengthInMonths = loanLength * 12;

        // Final Calculation
        double monthlyAmount = loanAmount * (monthInterest * Math.pow(1 + monthInterest, lengthInMonths)) /
                (Math.pow(1 + monthInterest, lengthInMonths) - 1);

        double totalPayments = monthlyAmount * lengthInMonths;
        double totalInterest = totalPayments - loanAmount;

        // Clear the Console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Show Results
        System.out.println("Your monthly payment will be " + String.format("%.2f", monthlyAmount));
        System.out.println("and the total interest paid will be " + String.format("%.2f", totalInterest));


    }


}
