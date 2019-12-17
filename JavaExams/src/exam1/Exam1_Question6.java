package exam1;

import java.util.Scanner;

public class Exam1_Question6 {
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	int length = inputScanner.nextInt();
	int [][] array = new int[length][length];
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			array[i][j]= inputScanner.nextInt();
		}
	}
	System.out.println();
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[j][i]+" ");
			
		}
		System.out.println();
	}
}

}
