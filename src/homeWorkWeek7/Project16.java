package homeWorkWeek7;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

import java.util.Scanner;

public class Project16 {
    public static void main(String[] args) {               //main method declared
        Scanner bat = new Scanner(System.in);              //Scanner declared
        System.out.println("Enter First Number :  ");      // print statement for user to enter number
        int num1 = bat.nextInt();                         //getting input from the scanner
        check(num1);                                     //Calling method

        bat.close();                                    //Scanner closed
    }



    static void check (int num1) {                                       //static method
        if(num1 > 0)                                                    //condition if applied
            System.out.println(num1 + " is a Positive number  ");       //Then print the positive statement

        else if (num1 < 0)                                              //condition else if applied
            System.out.println(num1 + " is a Negative number  ");     // Then print the negitive statement
        else                                                          // Condition else
            System.out.println(num1 + " is a Zero ");                 //Then print Zero statement

        {

        }
    }

}
