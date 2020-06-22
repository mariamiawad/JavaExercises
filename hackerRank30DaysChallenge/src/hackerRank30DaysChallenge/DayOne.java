package hackerRank30DaysChallenge;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-data-types/problem
public class DayOne {
	public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        i += scan.nextInt();
	        
	        d += scan.nextDouble();
	        scan.nextLine();
	        s += scan.nextLine();
	        
	     System.out.println(i);
	        System.out.println(d);
	        System.out.println(s);   
	        /* Declare second integer, double, and String variables. */

	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	        
	        /* Print the sum of both integer variables on a new line. */

	        /* Print the sum of the double variables on a new line. */
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */

	        scan.close();
	}
}
