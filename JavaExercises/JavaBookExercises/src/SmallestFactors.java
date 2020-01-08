import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestFactors {

	public SmallestFactors() {
		// 
	}
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int number = inputScanner.nextInt();
		List<Integer>list = getFactors(number);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		inputScanner.close();
	}
public static List<Integer> getFactors(int number) {
	List<Integer> arrayList = new ArrayList<Integer>();
	int i = 2;
	while (number>1) {
		if(number%i==0) {
			arrayList.add(i);
			number = number/i;
			continue;
		}
		i++;
	}
	return arrayList;
	
}
}
