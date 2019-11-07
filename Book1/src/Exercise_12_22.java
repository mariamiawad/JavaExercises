import java.util.*;
import java.io.*;

public class Exercise_12_22 {
	public static void main(String[] args) throws Exception {
		File folder = new File("C:\\Users\\maria\\eclipse-workspace\\Book1\\src\\Exercise_12_22");
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			replaceText(file);
		}
	}

	public static void replaceText(File file) throws FileNotFoundException {
		if (!file.exists()) {
			System.out.println("File " + file.getName() + " does not exist");
			System.exit(2);
		}

		String s2 = "";
		try (

				Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				s2 = s1.replace("Awad Mariam", "Mariam Awad");
			}
		}

		try (PrintWriter output = new PrintWriter(file);) {

			output.println(s2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}