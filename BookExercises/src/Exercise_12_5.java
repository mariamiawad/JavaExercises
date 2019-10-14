import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_12_5 {

	public Exercise_12_5() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise12_15.txt");
		Random random = new Random();
		PrintWriter printWriter = new PrintWriter(file);
		for (int i = 0; i < 100; i++) {
			printWriter.print(random.nextInt(101) + " ");
		}
		printWriter.close();
		Scanner inputScanner = new Scanner(file);
		int[] array = new int [100];
		int i =0;
		while (inputScanner.hasNext()) {
			array[i]=inputScanner.nextInt();
			i++;
			
		}
		Arrays.sort(array);
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]+" ");
			if(j%10==0 &&j>0) {
				System.out.println();
			}
		}
	}

}
