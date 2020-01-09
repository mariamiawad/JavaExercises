package exam03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exam03_Question03 {
	public static void main(String[] args) throws IOException {
		File file = new File("HelloWord.txt");
		BufferedReader bf = new BufferedReader(new FileReader(file));
		String string = "";
		File file2 = new File("HelloWord2.txt");
		if (!file2.exists()) {
			file2.createNewFile();
		}
		String string2 = "";
		PrintWriter printWriter = new PrintWriter(file2);
		while ((string = bf.readLine()) != null) {
			if (string.isBlank() && !string2.isBlank()) {
				string += "\n";
			}
			printWriter.write(string);
			string2 = string;
		}
		printWriter.close();
	}
}
