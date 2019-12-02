import java.util.ArrayList;
import java.util.Scanner;

public class OccurenceOfLargestNumber {

	public OccurenceOfLargestNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int max = 0;
		int count = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int x = inputScanner.nextInt();
		while (x != 0) {
			arrayList.add(x);
			x = inputScanner.nextInt();
		}
		int size = arrayList.size();
		for (int i = 0; i < size;) {
			if (max < arrayList.get(i)) {
				max = arrayList.get(i);
				count = 0;
				i = 0;
				continue;
			} else if (max == arrayList.get(i)) {
				count++;
			}
			i++;

		}
		System.out.println("Largest Number =" + max + " and occured " + count);
	}
}
