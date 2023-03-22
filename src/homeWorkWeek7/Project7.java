package homeWorkWeek7;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Project7 { //Class
    public static void main(String[] args) { //main method declared
        Scanner abc = new Scanner(System.in); //scanner declared
        System.out.println("Enter seller name: "); // Print statement to the get the output
        String name = abc.nextLine();
        System.out.println("Enter sales ID : ");  // Print statement to the get the output
        int id = abc.nextInt();
        System.out.println("Enter sales amount: "); // Print statement to the get the output
        int amount = abc.nextInt();
        System.out.println("Enter basic salary:  "); // Print statement to the get the output
        int basic = abc.nextInt();

        Project7 obj = new Project7();   //declared obj
        int grossSalary = obj.calculateCommission(amount) + basic;
        System.out.println("Seller's name is :" + name); // Print statement to the get the output
        System.out.println("Seller's ID is : " + id); // Print statement to the get the output
        System.out.println("Seller's sales amount is :" + amount); // Print statement to the get the output
        System.out.println("Seller's basic amount is : " + basic); // Print statement to the get the output
        System.out.println("Seller's gross salary is : " + grossSalary); // Print statement to the get the output
        abc.close(); //Scanner closed
    }

    public int calculateCommission(int amount) { //instance method called
        int commission = 0;
        if (amount >= 50000) { // if  condition declared
            commission = (amount * 35) / 100;
            System.out.println("Sales commission is :" + commission);
        } else if (amount >= 30000) {  // else if condition declared
            commission = (amount * 20) / 100;
            System.out.println("Sales commission is :" + commission); //Print statement to the get the output
        } else if (amount >= 20000) {  //else if condition declared
            commission = (amount * 10) / 100;
            System.out.println("Sales commission is :" + commission); //Print statement to the get the output
        } else if (amount >= 10000) { //else if condition declared
            commission = (amount * 5) / 100;
            System.out.println("sales commission is :" + commission);  //Print statement to the get the output
        }         return commission;

    }


        }
