package chapter17;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise_17_16 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter filename: ");
		File file = new File(inputScanner.nextLine());
		Map<Character, Integer> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.US_ASCII))) {

			String line = "";
			String string = "";
			while ((line = br.readLine()) != null) {
				string += line;
			}
			for (char c : string.toCharArray()) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			for (Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " count = " + entry.getValue());
			}
		} catch (Exception e) {

		}
	}
}
