import java.util.*;
import java.io.*;

public class Exercise_12_16 {
	public static void main(String[] args) throws Exception {
		args = new String[3];
		args[0] = "SourceFile.txt";
		args[1] = "Awad Mariam";
		args[2] = "Mariam Awad";
		if (args.length != 3) {
			System.out.println("Usage: Java Exercise_12_16 file oldString newString");
			System.exit(1);
		}

		// Check if file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}

		String s2 = "";
		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				s2 = s1.replace(args[1], args[2]);
			}
		}

		try (PrintWriter output = new PrintWriter(file);) {

			output.println(s2);

		}
	}
}