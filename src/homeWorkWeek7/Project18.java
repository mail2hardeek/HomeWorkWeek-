package homeWorkWeek7;
/**
 * Write a Java program to sum values of an array.
 */

import java.util.Scanner;

 public class Project18 { // Class created
    public static void main(String[] args) { // Main method declared
        Scanner xyz =new Scanner(System.in); // Scanner imported
        System.out.println("Enter first number : ");  // Print statement to the get the output
        int num1 =xyz.nextInt();
        System.out.println("Enter second number : "); // Print statement to the get the output
        int num2 =xyz.nextInt();
        System.out.println("Enter third number : "); // Print statement to the get the output
        int num3 =xyz.nextInt();
        System.out.println("Enter fourth number"); // Print statement to the get the output
        int num4 =xyz.nextInt();
        System.out.println("Enter fifth number"); // Print statement to the get the output
        int num5 =xyz.nextInt();

        int [] abc =new int []{num1, num2,num3,num4,num5}; //defined arrays
        int add = 0;

        for (int i=0; i<abc.length; i++) {
            add = add+ abc[i];
        }
        System.out.println("Sum of the elements of an array: " +add); // Print statement to the get the output
        xyz.close(); //Scanner closed
    }


}
