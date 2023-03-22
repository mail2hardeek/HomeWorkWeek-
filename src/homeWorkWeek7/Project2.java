package homeWorkWeek7;
/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Project2 { //Declare class

    public static void main(String[] args) {  // Declared main method
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the year as 4 digit : ");    // Printing Statement for user to enter number in console
        int n = abc.nextInt(); // Reading input for the use
        String year = n % 4 == 0 ? "This is a Leap year" : "This is not a Leap year"; //Have used Ternary operators Logic of program
        System.out.println(year);// Printing the output applying the logic
        abc.close();// Closing the Scanner
    }
}