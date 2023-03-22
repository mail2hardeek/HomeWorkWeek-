package homeWorkWeek7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *
 */

public class Project3 { //Declare the class

    public static void main(String[] args) { // declare a main method
        Scanner abc = new Scanner(System.in); // declare the scanner
        System.out.println("Enter Student Name:"); // Print statement to the got put
        String N = abc.nextLine();
        System.out.println("Student Roll No. :"); // Print statement to the got put
        int ID = abc.nextInt();
        System.out.println("Enter Maths marks (out of 100):"); // Print statement to the get the output
        int M = abc.nextInt();
        System.out.println("Enter Science marks (out of 100):"); // Print statement to the get the output
        int S = abc.nextInt();
        System.out.println("Enter English marks (out of 100):"); // Print statement to the get the output
        int E = abc.nextInt();

        if (M < 0 || M > 100 || S < 0 || S > 100 || E < 0 || E > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");{
                int s=(M +S + E);
                float p = (float)s/3;
                String r; if(M<=35){
                    r= "Fail";
                }else if (E<=35){  //declare else if condition
                    r = "Fail";
                } else if (S <=35){ //declare else if condition
                    r = "Fail";
                } else {             ///declare else condition
                    r = "Pass";
                    String g; if (p >=80) {
                        g = "A+";
                    } else if (p >=60) {
                        g ="A";
                    } else if (p >=50) {
                        g = "B";
                    } else if (p >=35) {
                        g = "C";
                    } else {
                        g = "F";
                    };
                                                                    // Print statement to the get the output
                    System.out.println("_____________________________________________ ");
                    System.out.println("|                                            |");
                    System.out.println("|             Mark Sheet                     |");
                    System.out.println("|___________________________________________ |");
                    System.out.println("|    Name        :"+N   +"                   |");
                    System.out.println("|    Roll no     :"+ID  +"                   |");
                    System.out.println("|___________________________________________ |");
                    System.out.println("|    Maths       :"+M+"                      |");
                    System.out.println("|    Science     :"+S+"                      |");
                    System.out.println("|    English     :"+E+"                      |");
                    System.out.println("|___________________________________________ |");
                    System.out.println("|    Total       :"+s+"                      |");
                    System.out.println("|___________________________________________ |");
                    System.out.println("|   Percentage   :"+p+"                      |");
                    System.out.println("|   Result       :"+r+"                      |");
                    System.out.println("|   Grade        :"+g+"                      |");
                    System.out.println("|___________________________________________ |");

                    abc.close(); //close scanner


                }

                    }
            }
        }
    }
