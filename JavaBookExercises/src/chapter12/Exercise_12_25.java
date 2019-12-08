package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_12_25 {
	final static String ASSOCIATE = "associate";
	final static String ASSISTANT = "assistant";
	final static String FULL = "full";
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		double sumAssociate = 0;
		double sumAssistant = 0;
		double sumFull = 0;
		double countAssistant = 0;
		double countAssociate = 0;
		double countFull = 0;
		File file = new File("C:/Users/maria/eclipse-workspace/JavaBookExercises/TextFiles/Chapter12/Salary.txt");
		File file2 = new File("C:/Users/maria/eclipse-workspace/JavaBookExercises/TextFiles/Chapter12/Result.txt");
		int count = 0;
		try (Scanner scanner = new Scanner(file); PrintWriter writer = new PrintWriter(file2)) {
			while (scanner.hasNext()) {
				String firstName = scanner.next();
				String lastName = scanner.next();
				String job = scanner.next();
				double salary = scanner.nextDouble();
				if (job.contains(ASSOCIATE)) {
					sumAssociate += salary;
					countAssociate++;
					count++;
				} else if (job.contains(ASSISTANT)) {
					sumAssistant += salary;
					countAssistant++;
					count++;
				} else if (job.contains(FULL)) {
					sumFull += salary;
					countFull++;
					count++;
				}

			}

		} catch (IOException e) {
	
			e.printStackTrace();
		}
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			}

			catch (IOException e) {
		
				e.printStackTrace();
			}
		}
		PrintWriter writer;
		try {

			writer = new PrintWriter(file2);
			writer.write("Sum Assistants " + df2.format(sumAssistant));
			writer.write("Average Assistants " + df2.format(sumAssistant / countAssistant));
			writer.write("Sum Associates " + df2.format(sumAssociate));
			writer.write("Average Associates " + df2.format(sumAssociate / countAssociate));
			writer.write("Sum Full " + df2.format(sumFull));
			writer.write("Average Assistants " + df2.format(sumFull / countFull));
			count--;

			writer.close();
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}

	}

}
