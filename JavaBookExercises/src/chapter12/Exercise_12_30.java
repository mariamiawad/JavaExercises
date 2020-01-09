package chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise_12_30 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter File Name");
		String fileName = scanner.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {

			StringBuilder sb = new StringBuilder();

			String line;
			while ((line = br.readLine()) != null) {

				sb.append(line);
			}
			char[] chars = sb.toString().toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			for (char c : chars) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			for (Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println("Number of " + entry.getKey() + "'s : " + entry.getValue());
			}

		}
	}

}
