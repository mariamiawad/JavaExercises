package exam03;

import java.util.Arrays;
import java.util.Scanner;

import sorting.QuickSort;
import sorting.QuickSortThreeWay;

public class Exam03_Question07 {
	public static void main(String[] args) {
		QuickSortThreeWay sort = new QuickSortThreeWay();
		Scanner inputScanner = new Scanner(System.in);
		String string1 = inputScanner.nextLine();
		String string2 = inputScanner.nextLine();
		Character[] array1 =  string1.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		Character[] array2 =  string2.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		sort.sort(array1);
		sort.sort(array2);
		String s1 = Arrays.toString(array1);
		String s2 =Arrays.toString(array2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
}
