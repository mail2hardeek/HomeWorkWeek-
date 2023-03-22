package homeWorkWeek7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.
 */

public class Project11 { //Class created
    public static void main(String[] args) { //main method declared
        System.out.println("Numbers Divided by 3:"); // Print statement to the get the output

        for(int i =1; i<100; i++) {
            if(i%3==0)
            System.out.println(i); // Print statement to the get the output

        }
        System.out.println("Numbers Divided by 5:"); // Print statement to the get the output
        for (int i=1; i<100; i++){
            if(i%5==0)
                System.out.println(i);

        }
    }

}
