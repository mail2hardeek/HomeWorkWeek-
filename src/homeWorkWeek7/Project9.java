package homeWorkWeek7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 */

import java.util.Scanner;
public class Project9 { //class created
    public static void main(String[] args) { //main method declared
        Scanner scan = new Scanner(System.in); //Import scanner
        System.out.println("Enter an alphabet from A to F: "); // Print statement to the get the output
        char alphabet = scan.next().charAt(0); // char used

        switch (alphabet) { //Switch used
            case 'A':
                System.out.println("City name : Albenia"); // Print statement to the get the output
                break;
            case 'B':
                System.out.println("City name : Bombay"); // Print statement to the get the output
                break;
            case 'C':
                System.out.println("City name : California"); // Print statement to the get the output
                break;
            case 'D':
                System.out.println("City name : Dundi"); // Print statement to the get the output
                break;
            case 'E':
                System.out.println("City name : Egham"); // Print statement to the get the output
                break;
            case 'F':
                System.out.println("City name : Farringdon"); // Print statement to the get the output
                break;
            default:
            System.out.println("Invalid entry. Please enter an alphabet from A to Z."); // Print statement to the get the output

                scan.close();


        }

    }


}
