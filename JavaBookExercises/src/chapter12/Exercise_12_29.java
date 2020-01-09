package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_12_29 {
	public static void main(String[] args) throws IOException {
		Scanner inputScanner = new Scanner(System.in);
		File folder = new File(inputScanner.next());
		File[] files = null;
		if (!folder.exists()) {
			folder.createNewFile();
		}
		if (folder.isDirectory()) {
			files = folder.listFiles();
		}
		String fileName = "";
		String subString = "";
		String newFileName = "";
		for (File file : files) {
			fileName = file.getName();
			newFileName = fileName;
			for (int i = 0; i < fileName.length()-1; i++) {
				if (fileName.charAt(i) == '_') {
					newFileName = fileName.substring(0, i);
					subString = fileName.substring(i+1);
					if (subString.length()<=1 && subString.charAt(0) != '0' ) {
						newFileName += "_0" + subString;
						break;
					}
					else {
						newFileName = fileName;
					}
					
				} 
			}
			file.renameTo(new File("C:/Users/maria/eclipse-workspace/JavaBookExercises/Exercisei_j/"+newFileName));
		}

	}
}
