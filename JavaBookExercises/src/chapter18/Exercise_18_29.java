package chapter18;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise_18_29 {
	public static void main(String[] args) {
// Prompt the user to enter a directory or a file
		System.out.print("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();

// Display the size
		File directoryFile = new File(directory);
		ArrayList<File> files = new ArrayList<>(Arrays.asList(directoryFile.listFiles()));
		
		System.out.println(getSize(files, 0));
	}

	public static int getSize(List<File> files, int count) {

		if (files.size() == 0) {
			return count;
		}
		files.remove(files.size()-1);
		count++;
		return getSize(files, count);

	}
}
