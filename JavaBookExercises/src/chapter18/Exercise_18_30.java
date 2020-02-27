package chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_18_30 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		String word = "Canada";
		File file = new File(
				"C:\\Users\\maria\\eclipse-workspace\\JavaBookExercises\\src\\chapter18\\exercise29\\text");
		ArrayList<File> list = new ArrayList<>(Arrays.asList(file.listFiles()));
		System.out.println(getWord(list, word, 0));

	}

	private static int getWord(ArrayList<File> list, String word, int count) throws IOException {
		if (list.size() <= 0) {
			return count;
		} else {
			BufferedReader reader = new BufferedReader(new FileReader(list.get(list.size() - 1)));
			String string = "";
			while ((string = reader.readLine()) != null) {
				if (string.contains(word)) {
					count++;

				}
				list.remove(list.size() - 1);
			}

			return getWord(list, word, count);
		}
	}
}
