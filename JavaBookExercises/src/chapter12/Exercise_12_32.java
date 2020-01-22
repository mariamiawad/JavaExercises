package chapter12;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise_12_32 {
	public static void main(String[] args) {

		File folder = new File("BabyName");
		File[] files = folder.listFiles();
		ArrayList<String> boys = new ArrayList<>();
		ArrayList<String> girls = new ArrayList<>();
		ArrayList<String> years = new ArrayList<>();
		for (File file : files) {
			String year = file.getName().replace("babynameranking", "");
			year = year.replace(".txt", "");
			try {
				Scanner read = new Scanner(file);
				while (read.hasNext()) {

					String s = read.nextLine();
					String[] temp = s.split(" ");
					boys.add(temp[1]);
					girls.add(temp[3]);
					years.add(year);

				}
			} catch (Exception e) {

			}

		}
		System.out.println("Year          Rank 1          Rank 2          Rank 1          Rank 2");
		for (int j = 0; j < boys.size()-1; j+=2) {
			System.out.println(years.get(j) + "          " + girls.get(j) + "          " + girls.get(j + 1)
					+ "          " + boys.get(j) + "          " + boys.get(j + 1));

		}

	}
}
