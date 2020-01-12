package exam03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import sorting.QuickSort;

public class Exam03_Question06 {
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	int n = inputScanner.nextInt();
	int m = inputScanner.nextInt();
	Set<Integer> set = new HashSet<>();
	for (int i = 0; i < n+m; i++) {
		set.add(inputScanner.nextInt());
	}
	List<Integer> list = new ArrayList<>();
	list.addAll(set);
	QuickSort sort = new QuickSort();
	Integer[]array = list.toArray(new Integer[list.size()]);
	sort.sortMedianOfThree(array);
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
	}
}
}
