package exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2_Question2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	List<Integer>list = new ArrayList<>();
	while (scanner.hasNextInt()) {
		list.add(scanner.nextInt());
	}
	int variable = list.get(0);
	int count = 1;
	int most = variable;
	int maxCount = count;
	for (int i = 1; i < list.size()-1; i++) {
		if (variable == list.get(i)) {
			count++;
		}
		else {
			variable = list.get(i);
			count =1;
			
		}
		if (count>maxCount) {
			maxCount = count;
			most = list.get(i);
		}
	}
	System.out.println("Longest run: "+maxCount+ " consecutive " +most+ "s.");
	
}
}
