package exam03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import sorting.QuickSort;
import sorting.QuickSortMedianOfThree;

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
	QuickSortMedianOfThree sort = new QuickSortMedianOfThree();
	Integer[]array = list.toArray(new Integer[list.size()]);
	sort.sort(array);
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
	}
}
}
