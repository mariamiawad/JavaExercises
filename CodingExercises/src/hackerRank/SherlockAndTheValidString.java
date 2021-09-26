package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class SherlockAndTheValidString {
	/*
	 * Complete the 'foo' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. STRING_ARRAY codeList 2. STRING_ARRAY shoppingCart
	 */

	 public static List<Integer> reassignedPriorities(List<Integer> priorities) {
		 int [] temp = new int[100];
		 for (int i = 0; i < priorities.size(); i++) {
			temp[priorities.get(i)]= 1;
		}
		 int sum = 1;
		 for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 1) {
				temp [i] = sum++;
				
			}
		}
		 List<Integer> list = new ArrayList<Integer>();
		 for (int i = 0; i < priorities.size(); i++) {
			list.add(temp[priorities.get(i)]);
		}
		 return list;
	 }
		

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(9);

		list.add(3);
		list.add(2);
		list.add(3);
		
		System.out.println(reassignedPriorities(list));
	}
}
