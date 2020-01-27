package chapter20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_20_01 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		File file = new File("1.txt");

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String string;
		ArrayList<String>list = new ArrayList<>();
		while ((string = reader.readLine()) != null) {
			list.add(string);
		}
		ArrayList<String[]> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {

			String[] strings = list.get(i).split(" ");
			list2.add(strings);
		}
		list.clear();
		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.get(i).length; j++) {
				list.add(list2.get(i)[j]);
			}
		}
		Object [] objects =list.toArray();
		String[] strings = Arrays.copyOf(objects, objects.length, String[].class);
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
	}
}
