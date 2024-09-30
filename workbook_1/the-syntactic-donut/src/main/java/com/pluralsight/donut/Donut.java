package com.pluralsight.donut;

// Delimiters

/*
{} Curly braces

Surround:
*

Method body
*

Class declaration
*

Array initializer


* [ ] Square brackets
*

Array declarations
*

Array access

* <>
Pointy brackets
*

Template parameter lists
*

( ) Parentheses
*

Parameter list for a method


Semicolon
*

Ends a statement
 */

public class Donut {
    static double price = .25;

    static double getTotal(int numberOfDonuts) {
        return price * numberOfDonuts;

    }

    public static void main (String[] args) {
        System.out.println("A dozen donuts cost:");
        System.out.println(getTotal (12)+ "dollars");
    }
}
