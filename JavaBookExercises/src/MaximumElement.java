import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumElement {

	public static Integer getMaximumElement(ArrayList<Integer>arrayList) {
		Integer maxInteger =0;
		for (int i = 0; i < arrayList.size(); i++) {
			if (maxInteger.compareTo(arrayList.get(i))<0) {
				maxInteger = arrayList.get(i);
				
			}
		}
		return maxInteger;
	}
public static void main(String[] args) {
	Scanner inScanner = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	while (inScanner.hasNextInt()) {
		list.add(inScanner.nextInt());
		
	}
	System.out.println(getMaximumElement(list));
}
}
