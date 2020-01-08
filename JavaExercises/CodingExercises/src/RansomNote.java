import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {
	static Hashtable<String, Integer> magazineMap = new Hashtable<String, Integer>();

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		if (magazine.length >= note.length) {

			for (int i = 0; i < magazine.length; i++) {
				if (magazineMap.containsKey(magazine[i])) {
					magazineMap.replace(magazine[i], magazineMap.get(magazine[i]) + 1);
				} else {
					magazineMap.put(magazine[i], 1);
				}
			}

			for (int i = 0; i < note.length; i++) {
				if (magazineMap.containsKey(note[i])) {
					magazineMap.replace(note[i], magazineMap.get(note[i]) - 1);
					if (magazineMap.get(note[i]) < 0) {
						System.out.println("No");
						return;
					}
				}

				else if (!magazineMap.containsKey(note[i])) {
					System.out.println("No");
					return;
				}

			}

			System.out.println("Yes");
			return;

		}

		else
			System.out.println("No");
	}

	private static int countWorld(List<String> arrayList, String wordString) {
		int count = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).equals(wordString)) {
				count++;

			}

		}

		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
