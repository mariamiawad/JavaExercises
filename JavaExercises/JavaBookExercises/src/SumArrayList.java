import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Enter 5 numbers");
	ArrayList<Double> list = new ArrayList<Double>();
	for (int i = 0; i <5; i++) {
		list.add(inputScanner.nextDouble());
	}
	System.out.println(sum(list));
}
	public SumArrayList() {
		// 
	}
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
