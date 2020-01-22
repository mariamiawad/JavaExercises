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
			String s = file.getName();
			StringBuilder sb = new StringBuilder(s);

			if (!sb.toString().matches("._0[\\d].*")) {
				sb.insert(s.indexOf('_') + 1, "0");

			}
			file.renameTo(new File("Exercise12_29/"+sb.toString()));
		}

	}

}
