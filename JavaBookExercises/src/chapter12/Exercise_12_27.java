package chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise_12_27 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		File folder = new File(inputScanner.next());
		File[] files = null;
		files = folder.listFiles();
		String fileName = "";
		String subString = "";
		String newFileName = "";
		for (File file : files) {
			String s = file.getName();
			StringBuilder sb = new StringBuilder(s);
			if (!sb.toString().matches("Exercise0[\\d].*")) {

				sb.insert(s.indexOf('_') - 1, "0");

			}
			if (!sb.toString().matches("Exercise0[\\d]_0[\\d].*")) {
				sb.insert(s.indexOf('_') +1, "0");

			}
			file.renameTo(new File(sb.toString()));
		}

	}

}
