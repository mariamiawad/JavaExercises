package chapter12;
import java.io.File;
import java.util.Scanner;

public class Exercise_12_19 {

	public Exercise_12_19() {
		// 
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\maria\\eclipse-workspace\\Book1\\src\\12.19\\Lincoln.txt");
		try {
			Scanner inputScanner = new Scanner(file);
			String string = "";
			while (inputScanner.hasNextLine()) {
				string += inputScanner.nextLine();
				
				
			}
			String[] strings = string.split(" ");
			int count = 0;
			for (int i = 0; i < strings.length; i++) {
				if(strings[i].contains("—")|| strings[i].contains("-")) {
					count++;
				}
			}
		
			System.out.println(strings.length +count);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
