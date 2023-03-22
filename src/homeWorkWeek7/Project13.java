package homeWorkWeek7;

/**
 * Write a Java program which input any number between 1 to 7 and
 * it print The Days  name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Project13 { //class created
    public static void main(String[] args) { // declared the main method

        Scanner xyz = new Scanner(System.in); //imported scanner

        System.out.println("Enter a number between 1 and 7:  "); // Print statement to the get the output
        int dayNumber = xyz.nextInt();

        String dayName;
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid week number");

                xyz.close(); //Scanner closed

        }

    }
}