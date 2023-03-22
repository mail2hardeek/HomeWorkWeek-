package homeWorkWeek7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 * find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

public class Project10 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        System.out.print("Enter first number: ");                                //Statement for user to enter first number
        int a = abc.nextInt();                                               //integer assigned to store value

        System.out.print("Enter second number: ");                               //Statement for user to enter second number
        int b = abc.nextInt();                                               //integer assigned to store value

        System.out.print("Enter operator (+, -, * , / ):");                      //Statement for user to enter any operators from given list
        char operator = abc.next().charAt(0);                                //char assigned to store operator

        double result;

        if (operator == '+') {                                                  //condition applied
            result = a + b;                                                     // if condition applied then perform this operation
        } else if (operator == '-') {                                           //condition applied
            result = a - b;                                                     // if condition applied then perform this operation
        } else if (operator == '*') {                                           //condition applied
            result = a * b;                                                     // if condition applied then perform this operation
        } else if (operator == '/') {                                           //condition applied
            result = a / b;                                                     // if condition applied then perform this operation
        } else {                                                                //if any of the above condition not satisfied
            System.out.println("Input valid operator");                         //Print this statement
            return;                                                             // return value
        }

        System.out.println(a + "" + operator + "" + b + "=" + result);         //Print final statement in console with the result

        abc.close(); //Scanner closed

    }


}
