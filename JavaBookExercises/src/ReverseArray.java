import java.util.Scanner;

public class ReverseArray {

	public static void getreverseArray(int[] array) {
		int temp = 0;
		for (int i = array.length-1, j = 0; i>=0; i--, j++) {
			for (int j2 = 0; j2 < j; j2++) {
				temp = array[i];
			array[i] = array[j];
				array[j]=temp;
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 10 numbers");
	int [] array= new int[10];
	for (int i = 0; i < array.length; i++) {
		array[i]= input.nextInt();
	}
	getreverseArray(array);
}
}
