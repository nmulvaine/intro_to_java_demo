package com.pluralsight.financialcalc;
import java.util.Scanner;

public class Calculator {
    public static void main (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please select and option from below." +
                "1: Mortgage Calculator" +
                "2: CD Value" +
                "3: Annuity Value" +
                "4: Exit");
        String choice = scanner.next();

    }
}
