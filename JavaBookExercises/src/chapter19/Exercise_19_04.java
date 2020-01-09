package chapter19;
import java.util.Scanner;

public class Exercise_19_04 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		Integer [] list = new Integer [10];
		for (int i = 0; i < list.length; i++) {
			list[i]= inputScanner.nextInt();
		}
		int key = 10;
		int result = linearSearch(list, key);
		System.out.println(result);
	}
		
	
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(key) == 0) {
				return i;
			}
			
		}
		return -1;
	}
}
