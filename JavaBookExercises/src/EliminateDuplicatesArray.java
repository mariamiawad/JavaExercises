import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EliminateDuplicatesArray {
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Enter ten numbers ");
	int [] list = new int [10];
	for (int i = 0; i <10; i++) {
		list[i] = inputScanner.nextInt();
	}
	int[] newList = eliminateDuplicates(list);
	for (int i = 0; i < newList.length; i++) {
		System.out.print(newList[i]+" ");
	}
}
	public static int[] eliminateDuplicates(int[] list) {
		Arrays.sort(list);
		int [] tempArray = new int[list.length];
		int j = 0;
		for (int i=0; i < list.length-1;i++) {
			if(list[i]!=list[i+1]) {
				tempArray[j++] = list[i];
				
				
			}
		}
		if(tempArray[j] != list[9]) {
			tempArray[j++] = list[9];
		}
		int [] array = new int[j];
		for (int i = 0; i < j; i++) {
			array[i]= tempArray[i];
		}
		return array;
	}
	
}
