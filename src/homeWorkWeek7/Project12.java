package homeWorkWeek7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Project12 { // declared class
    public static void main(String[] args) { //main method declared
        Scanner abc = new Scanner(System.in); // scanner imported
        System.out.println("Enter a value:  "); // Print statement to the get the output
        String input = abc.next (); //string input

        if (input.matches("[0-9]+")) { // if condition declared
            System.out.println("Input is a number."); // Print statement to the get the output
        } else if (input.matches("a-z A-Z")) {  // else if condition declared
            System.out.println("Input is an alphabet."); // Print statement to the get the output
        } else {  // else if condition declared
            System.out.println("input is a symbol."); // Print statement to the get the output
            abc.close(); //Scanner closed

        }
    }

    }


