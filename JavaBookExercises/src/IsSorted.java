import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsSorted {

	public IsSorted() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter list:");
		int number = inputScanner.nextInt();
		int [] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = inputScanner.nextInt();
		}
		if (isSorted(array)) {
			System.out.println("The list is already sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
	}
	public static boolean isSorted(int[] list) {
		boolean flag = false;
		for (int i = 0; i < list.length-1; i++) {
			if(list[i]<= list[i+1]) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
