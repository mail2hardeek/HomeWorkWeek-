package homeWorkWeek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */

import java.util.Scanner;

public class Project19 { // Create a class
    public static void main(String[] args) { //main method declared
        Scanner Hardik = new Scanner(System.in); //Scanner imported
        System.out.println("Enter First Number :  "); // Print statement to the get the output
        int num1 = Hardik.nextInt();
        System.out.println("Enter Second Number :  "); // Print statement to the get the output
        int num2 = Hardik.nextInt();
        System.out.println("Enter Third Number :  "); // Print statement to the get the output
        int num3 = Hardik.nextInt();
        System.out.println("Enter Fourth Number :  "); // Print statement to the get the output
        int num4 = Hardik.nextInt();
        System.out.println("Enter Fifth Number :  "); // Print statement to the get the output
        int num5 = Hardik.nextInt();
        System.out.println("Enter Sixth Number :  "); // Print statement to the get the output
        int num6 = Hardik.nextInt();
        System.out.println("Enter Seven Number :  "); // Print statement to the get the output
        int num7 = Hardik.nextInt();

        int [] num = new int[] {num1, num2, num3, num4, num5,num6, num7}; // define arrays

        int sum = 0; //calculate sum of all array elements

        for (int i=0; i < num.length; i++)

            sum = sum + num[i];

        double average = sum / num.length; //calculate average value
        System.out.println("Average value of the array elements is : " + average); // Print statement to the get the output


    }
}
