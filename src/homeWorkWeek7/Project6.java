package homeWorkWeek7;

import java.util.Scanner;

/**Write a java program to input any number and find out if it’s odd or even
 *
 */

public class Project6 {  //creat class
    public static void main(String[] args) { // declare main method
        Scanner scanner =new Scanner(System.in); //Scanner
        System.out.println("Enter a number"); // ask user 
        int number = scanner.nextInt();

        if (number %2 ==0) {         //if statement
            System.out.println(number + " is even"); //print statement for even number
        }else {             //else statement
            System.out.println(number + " is odd"); //print statement for odd number
            
            scanner.close(); //scanner close
        }

    }

}
