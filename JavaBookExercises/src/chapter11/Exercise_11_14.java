package chapter11;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_14 {

	public Exercise_11_14() {
		// 
	}

	public static void main(String[] args) {
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		ArrayList<Integer>list2 = new ArrayList<Integer>();
		ArrayList<Integer>combinedList = new ArrayList<Integer>();
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter five integers for list1: ");
		for (int i = 0; i < 5; i++) {
			list1.add(inputScanner.nextInt());
		}
		System.out.println("Enter five integers for list2: ");
		for (int i = 0; i < 5; i++) {
			list2.add(inputScanner.nextInt());
		}
		combinedList = union(list1, list2);
		for (int i = 0; i < combinedList.size(); i++) {
			System.out.print(combinedList.get(i)+" ");
		}
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer>combinedList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			combinedList.add(list1.get(i));
		}
		for (int i = 0; i < 5; i++) {
			combinedList.add(list2.get(i));
		}
		return combinedList;
	}
}
