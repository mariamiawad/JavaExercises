import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortStudent {

	public SortStudent() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter number of students");
		int numberOfSytudent = inputScanner.nextInt();
		System.out.println("Enter students name and score");
		for (int i = 0; i < numberOfSytudent; i++) {
			
			String student = inputScanner.next();
			double score = inputScanner.nextDouble();
			map.put(student, score);
		}
		 Map<Object, Object> sortedByCount =  // now let's sort the map in decreasing order of value
				    map
			        .entrySet()
			        .stream()
			        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
			        .collect(
			            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
			                LinkedHashMap::new));
			 
		for (Entry<Object, Object> entry : sortedByCount.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}

}
