package sorting;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

	public <T> void shuffle(T[] arr) {
		Random random = new Random();
		for (int i = arr.length - 1; i > 0; i--) {
			int r = random.nextInt(i + 1);
			T temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
		}
	}
	public static void main(String[] args) {
		Integer [] array = new Integer [10];
		for (int i = 0; i < array.length; i++) {
			array[i]= i;
		}
		System.out.println(Arrays.toString(array));
		Shuffle shuffle = new Shuffle();
		shuffle.shuffle(array);
		System.out.println(Arrays.toString(array));
	}
	
}
