package exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam03_Question02 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String string = inputScanner.nextLine();
		String temString = "";
		int j = 0;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i)=='.') {
				list.add(string.substring(j, i));
				j = i+1;
			}
			
		}
		list.add(string.substring(j, string.length()));
		for (int i = list.size()-1; i >=0 ; i--) {
			String string2 = list.get(i)+".";
			if (i == 0) {
				string2 = string2.replace(".", "");
			}
			System.out.print(string2);
		}
	}
	
}
