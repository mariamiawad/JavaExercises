package chapter17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_17_18 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner inputScanner = new Scanner(System.in);
		String string = inputScanner.nextLine();
		File file = new File(string);
		 String bits = "";
	        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {

	            int r;
	            while ((r = in.read()) != -1)
	                bits += " " + getBits(r);
	        }
	        System.out.println(bits);
	}
	public static String getBits(int value) {
		String string = value+"";
		String temp ="";
		String byteString="";
		for (int i = 0; i < string.length(); i++) {
			byteString+=Integer.toBinaryString(Integer.valueOf(string.charAt(i)));
			
		}
		for (int i = 0; i < byteString.length() && i<=7; i++) {
			temp+= byteString.charAt(i);
		}
	
	return temp;

	}
}
