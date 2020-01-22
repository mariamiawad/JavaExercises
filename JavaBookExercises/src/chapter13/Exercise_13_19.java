package chapter13;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_13_19 {
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Enter a decimal number:");
	String number = inputScanner.next();
	Exercise_13_15 exercise_13_15 = new Exercise_13_15(number);
	System.out.println(exercise_13_15.toString());
}
}
