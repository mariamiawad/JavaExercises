import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class KitchenUtensils {

	public static void getKitchenUtensils(List<Integer>list, int remaining, int guests) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			
			if (!map.containsKey(list.get(i))) {
				map.put(list.get(i), 1);
			} else {
				map.put(list.get(i), map.get(list.get(i)) + 1);
			}
		}
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(max<entry.getValue())
				max = entry.getValue();
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()<guests*(Math.ceil(max/(guests*1.0)))) {
			
				map2.put(entry.getKey(),(int)(guests*(Math.ceil(max/(guests*1.0))) - entry.getValue()));
			}
		}
		
		int sum =0;
//		for (Entry<Integer, Integer> entry : map2.entrySet()) {
//			
//
//		}
		for (Entry<Integer, Integer> entry : map2.entrySet()) {
			sum += entry.getValue();
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter number of remaining Utensils");
		int remaining = input.nextInt();
//		System.out.println("Enter number of guests");
		int guests = input.nextInt();
//		System.out.println("Enter type");
		List<Integer> list = new ArrayList<Integer>();
		while (input.hasNextInt()) {
			list.add(input.nextInt());
		}
		getKitchenUtensils(list, remaining, guests);
	}

}
