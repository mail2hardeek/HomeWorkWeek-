package homeWorkWeek7;

/**
 * Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,  otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400. Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999) ● isLeapYear(1600);  should return true since 1600 is a leap year
 * ● isLeapYear(2017);  should return false since 2017 is not a leap year
 * ● isLeapYear(2000); should return true because 2000 is a leap year
 */

public class Project4 {  //Class name
        public static boolean isleapyear(int year) {                               //Static method
            if (year < 1 || year > 9999) {                                         //Condition applied
                return false;                                                      //If the condition return the value

            } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){       //Condition applied
                return true;                                                       //If condition applied is true
            } else{                                                                // else statement
                return false;                                                      //If above condition is not true
            }
        }
        public static int getDaysInMonth (int month, int year){                    //Static method applied
            if (month <1 || month >12 || year <1 || year > 9999) {                 //Condition applied
                return -1;                                                         //If above vale satisfies then returns default value -1
            } else  {
                switch (month){                                                    //Using switch method
                    case 2:
                        if (isleapyear(year)){                                     //Condition applied
                            return 29;                                            //return value
                        }else {                                                   //if above condition is true
                            return 28;                                            //return value
                        }
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;                                                //return value
                    default:                                                     // if none of above the condition
                        return 31;                                               //return value
                }
            }
        }
        public static void main(String[] args) {                                  //Main method
            System.out.print("Result for January  2020 : ");                      //Print statement
            System.out.println(getDaysInMonth(1,2020));                //Print statement with data

            System.out.print("Result for February 2020 : ");                      //Print statement
            System.out.println(getDaysInMonth(2,2020));                //Print statement with data

            System.out.print("Result for February 2018 : ");                     //Print statement
            System.out.println(getDaysInMonth(2,2018));               //Print statement with data

            System.out.print("Result for first - month and year 2020 : ");       //Print statement
            System.out.println(getDaysInMonth(-1,2020));              //Print statement with data

            System.out.print("Result for first  month and year - 2020 : ");      //Print statement
            System.out.println(getDaysInMonth(1,-2020));              //Print statement with data
        }
    }

