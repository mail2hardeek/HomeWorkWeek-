package homeWorkWeek7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 */

public class Project5 {                     //Class name
    public static void main(String[] args) { //Main method
        Scanner abc = new Scanner(System.in); //Importing Scanner
        System.out.println("Enter your name");  // Print statement to the get the output
        String name =abc.nextLine();
        System.out.println("Enter your ID");  // Print statement to the get the output
        int id =abc.nextInt();
        System.out.println("Enter your Salary");  // Print statement to the get the output
        int basic =abc.nextInt();

        double HRA = 0.1 * basic;
        double DA = 0.08 * basic;
        double TA = 0.09 * basic;
        double PF = 0.2 * basic;
        double GS = basic+HRA+DA+TA-PF;

        // Print statement to the get the output


        System.out.println("---------------------------------");
        System.out.println("|           Salary Slip         |");
        System.out.println("|-------------------------------|");
        System.out.println("| Employee ID        : "+id  +" |");
        System.out.println("| Employee Name      : "+name+" |");
        System.out.println("|-------------------------------|");
        System.out.println("| Basic Salary       :"+ basic + "  |");
        System.out.println("| HRA 10%            :"+ HRA+ " |");
        System.out.println("| TA 8%              :"+ TA + " |");
        System.out.println("| DA 9%              :"+ DA + " |");
        System.out.println("| PF 20%             :"+ PF + " |");
        System.out.println("|-------------------------------|");
        System.out.println("| Gross Salary       :"+ GS + " |");
        System.out.println("=================================");


        abc.close(); //close scanner

    }
}
