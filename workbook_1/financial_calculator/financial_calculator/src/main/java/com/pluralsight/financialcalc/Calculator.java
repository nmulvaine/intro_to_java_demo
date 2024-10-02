package com.pluralsight.financialcalc;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        CdValue cdValue = new CdValue();
        boolean exit = false;
        Scanner userAnswer = new Scanner(System.in);

        while (!exit) {

            System.out.println("""
                    Welcome. Please select and option from below.
                    1: Mortgage Calculator
                    2: CD Value
                    3: Annuity Value
                    4: Exit
                    """);
            String choice = userAnswer.nextLine().toLowerCase();

            //Checks for numeric answer and converts string to int
            try {
                int intChoice = Integer.parseInt(choice);
                switch (intChoice) {
                    case 1:
                        System.out.println("Opening Mortgage Calculator");
                        //consoleClear();
                        mortgage.mortgageCalc();
                        break;
                    case 2:
                        System.out.println("Opening CD Value Calculator");
                        cdValue.cdCalc();
                        break;
                    case 3:
                        System.out.println("Opening Annuity Value Calculator");

                        break;
                    case 4:
                        System.out.println("Exiting Application");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please select another");
                }
            } catch (NumberFormatException e) {
                switch (choice) {
                    case "mortgage calculator":
                        System.out.println("Opening Mortgage Calculator");
                        break;
                    case "cd value":
                        System.out.println("Opening CD Value Calculator");
                        break;
                    case "annuity value":
                        System.out.println("Opening Annuity Value Calculator");
                        break;
                    case "exit":
                        System.out.println("Exiting Application");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please select another");
                }
            }

        }
    }

    /*public static void consoleClear(){
        System.out.print("\033[H\033[2J");
        System.out.print("\033\143");
        System.out.flush();
    }*/
}