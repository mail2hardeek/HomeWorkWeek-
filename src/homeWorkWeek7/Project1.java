package homeWorkWeek7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Project1 {   //Class declaration
    public static void main(String[] args) {  //Declare main method
        System.out.println("Enter any number : "); //Printing statement for users

        Scanner scan = new Scanner(System.in); //import scanner command
        int n = scan.nextInt(); //define value in n
String result = n % 2 == 0? "This is an even number" : "This is an odd number"; //Have used Ternary operation

        System.out.println(result); //Printing the output
    }


}
