package chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise_12_26 {
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	String directoryName = inputScanner.next();
	File file = new File(directoryName);
	if (file.mkdir()) {
		System.out.println("Directory created successfully");
	}
	else {
		System.out.println("Directory already exists");
	}
	
}
}
