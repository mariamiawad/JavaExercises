package chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercise_21_02 {
	private static Object object;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\maria\\OneDrive\\Desktop\\Exercise_21_02\\New Text Document.txt");
		Scanner scanner = new Scanner(file);
		
		Set<String> set = new HashSet<String>();
		while (scanner.hasNext()) {
			String[] s = scanner.nextLine().split(" ");
			for (int i = 0; i < s.length; i++) {
				set.add(s[i]);
			}
		}
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);
		scanner.close();
	}
}
