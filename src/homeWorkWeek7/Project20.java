package homeWorkWeek7;

/**
 * Write a Java program to test if an array contains a specific value.
 */

import java.util.Scanner;

public class Project20 {
    public static void main(String[] args) {                //main method declared
        Scanner bat = new Scanner(System.in);           //Scanner declared
        System.out.println("Enter First Number :  ");
        int num1 = bat.nextInt();
        System.out.println("Enter Second Number :  ");
        int num2 = bat.nextInt();
        System.out.println("Enter Third Number :  ");
        int num3 = bat.nextInt();
        System.out.println("Enter Fourth Number :  ");
        int num4 = bat.nextInt();
        System.out.println("Enter Fifth Number :  ");
        int num5 = bat.nextInt();

        int [] numbers ={num1,num2,num3,num4,num5}; // Define value to 5 arrays
        System.out.println("Enter the number ");    // User inserts one
        int ice = bat.nextInt();
        boolean containsvalue = false;



        for (int i = 0; i < numbers.length; i++) { //Logic applied
            if (numbers [i] == ice){    //Condition sapply
                containsvalue = true;  //it shows if the array value is true
                break;                                          //code break
            }
    }

        if (containsvalue) {
            System.out.println("The array contains " + ice); //print result if the array contains
        } else {
            System.out.println("The array doesn't contain " + ice); //print result if the array doesn't contains values
        }
            bat.close();   //Scanner close
        }
}

