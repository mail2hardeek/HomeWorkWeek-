package homeWorkWeek7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Project17 { //Class created
    public static void main(String[] args) { //Declared main method
        Scanner abc = new Scanner(System.in); // scanner imported

        System.out.println("Enter first word : "); // Print statement to the get the output
        String AA = abc.nextLine();

        System.out.println("Enter Second word : "); // Print statement to the get the output
        String BB = abc.nextLine();

        System.out.println("Enter Third word : "); // Print statement to the get the output
        String CC = abc.nextLine();

        System.out.println("Enter Fourth word : "); // Print statement to the get the output
        String DD = abc.nextLine();

        System.out.println("Enter Fifth word : "); // Print statement to the get the output
        String EE = abc.nextLine();

        String [] words = {AA, BB, CC, DD, EE}; //defined arrays
        Arrays.sort(words);
        System.out.println("Sorted numeric array: " + Arrays.toString(words));

        System.out.println("Enter first number num1: "); // Print statement to the get the output
        int num1 =abc.nextInt();
        System.out.println("Enter second number num2: "); // Print statement to the get the output
        int num2 = abc.nextInt();
        System.out.println("Enter third number num3: "); // Print statement to the get the output
        int num3 = abc.nextInt();
        System.out.println("Enter four number num4: "); // Print statement to the get the output
        int num4 = abc.nextInt();
        System.out.println("Enter fifth number num5"); // Print statement to the get the output
        int num5 = abc.nextInt();

        int [] nums = {num1,num2,num3,num4,num5}; //defined arrays
        Arrays.sort(nums);
        System.out.println("Sorted numeric array: " + Arrays.toString(nums));
        abc.close(); //scanner closed
    }

}
