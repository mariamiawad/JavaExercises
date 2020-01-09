package chapter08;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise_08_36 {
	public static void main(String[] args) {
		Scanner inputscanner = new Scanner(System.in);
		System.out.print("Enter number n:");
		int n = inputscanner.nextInt();
		char[][] c = new char[n][n];
		String string = "";
		for (int i = 0; i < c.length; i++) {
			string = "";
			for (int j = 0; j < c[i].length; j++) {
				string += inputscanner.next().charAt(0);
				c [i][j] = string.charAt(j);
			}
			if(!isValidCharacter(string, n)) {
				char s = (char) ('a' + n -1);
				System.out.println("Wrong input: the letters must be from A and " + Character.toUpperCase(s));
			}
			
		}
		if(checkEachColumn(c) && checkEachRow(c)) {
			System.out.println("The input array is a Latin square");
		}
		else {
			System.out.println("The input array is a not Latin square");
		}
	}
	public static boolean isValidCharacter(String string, int n) {
		String string2 = "";
		for (char c = 'a'; c < 'a' + n; c++) {
			string2 += c+"";
		}
		string2 = string2.toUpperCase();
		char[] c = string.toCharArray();
		Arrays.sort(c);
		string ="";
		for (int i = 0; i < c.length; i++) {
			string+=c[i];
		}
		
		for (int i = 0; i < string.length(); i++) {
			if(!string2.contains(string.charAt(i)+"")) {
				return false;
			}
		}
		return true;
		
	}
	public static boolean checkEachColumn(char[][]c) {
		Map<Character, Integer> map = new HashMap<>();
		for (int column = 0; column < c.length; column++) {
			map = new HashMap<>();
			for (int row = 0; row < c.length; row++) {
				if(map.containsKey(c[row][column])) {
					map.put(c[row][column], map.get(c[row][column])+1);
				}
				else {
					map.put(c[row][column], 1);
				}
				
			}
			for(Entry<Character, Integer> entry : map.entrySet()) {
				if(entry.getValue() >1) {
					return false;
					
				}
			}
		}
		return true;
	}
	public static boolean checkEachRow(char [][] c ) {
		Map<Character, Integer> map = new HashMap<>();
		boolean flag = true;
		for (int i = 0; i < c.length; i++) {
			map = new HashMap<>();
			for (int j = 0; j < c[i].length; j++) {
				if(map.containsKey(c[i][j])) {
					map.put(c[i][j], map.get(c[i][j])+1);
				}
				else {
					map.put(c[i][j],1);
				}
			}
			for(Entry<Character, Integer> entry : map.entrySet()) {
				if(entry.getValue() >1) {
					return false;
					
				}
			}
		}
		return true;
	}
}
