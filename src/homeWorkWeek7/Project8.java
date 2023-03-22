package homeWorkWeek7;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Project8 { // declare class
    public static void main(String[] args) { //declare main method
        Scanner abc =new Scanner(System.in); // import scanner

        System.out.println("Enter an alphabet from A to F: "); // Print statement to the get the output
        char alphabet = abc.next().charAt(0); //char variable used

        if(alphabet == 'A'){  // if condition used

            System.out.println("City name: Ahmedabad"); // Print statement to the get the output
        } else if (alphabet =='B') {  //else if condition used
            System.out.println("City name: Berlin"); // Print statement to the get the output

        } else if (alphabet == 'C') {  //else if condition used
            System.out.println("City name : Chennai"); // Print statement to the get the output
        } else if (alphabet == 'D') { //else if condition used
            System.out.println("City name: Durham"); // Print statement to the get the output
        } else if (alphabet == 'E') { // else if condition used
            System.out.println("City name: Egam"); // Print statement to the get the output
        } else if (alphabet == 'F') { // else if condition used
            System.out.println("City name : Farrington"); // Print statement to the get the output
        } else { //else if condition used
            System.out.println("Invalid entry. Please enter an alphabet from A to F. "); // Print statement to the get the output

            abc.close();
        }

    }

    }





