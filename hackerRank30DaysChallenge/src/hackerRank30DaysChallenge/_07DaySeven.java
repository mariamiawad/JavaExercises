package hackerRank30DaysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class _07DaySeven {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int [] integers = new int [n];
	for (int i = 0; i < integers.length; i++) {
		integers[i] = scanner.nextInt();
	}
	reverseArray(integers);
//	System.out.println(Arrays.toString(integers));
	
}
private static void reverseArray(int [] integers) {
	int j = 0;
	for (int i = integers.length-1; i >=0 && j< integers.length; i--, j++) {
		if (j>= i) {
			break;
			
		}
		int temp = integers[i];
		integers[i] = integers[j];
		integers[j]= temp;
		
	}
	for(int i = 0; i< integers.length; i++) {
        System.out.print(integers[i]+" ");
    }
}
}
