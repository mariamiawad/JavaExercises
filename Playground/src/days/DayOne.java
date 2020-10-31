package days;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import helper.Relation;

public class DayOne {

	public String firstRecurring(String s) {

//		for (int j = 0; j < s.length(); j++) {
//			char c = s.charAt(j);
//			for (int i =j+1; i < s.length(); i++) {
//				
//				if (c ==  s.charAt(i)) {
//					return c+"";
//				}
//			}
//		}

//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for (int i = 0; i < s.length(); i++) {
//			if (map.containsKey(s.charAt(i))) {
//				
//				return s.charAt(i)+"";
//			}
//			map.put(s.charAt(i), 1);
//		}

		int[] array = new int[26];
		for (char c : s.toCharArray()) {
			array[c - 65]++;
			System.out.println(Arrays.toString(array));
			if (array[c - 65] > 1) {
				return c + "";
			}
		}

		return null;
	}

	public void printTree(List<Relation> list) {
		// to find a node that has no children:
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		Set<String> set = new HashSet<String>();
		List<String> listMap = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {

			String parent = list.get(i).getParent();
			String child = list.get(i).getChild();

			if (!map.containsKey(parent)) {
				map.put(parent, new ArrayList<String>());
			}

			listMap = map.get(parent);
			listMap.add(child);
			set.add(child);
			set.add(parent);
			
		}
		System.out.println(set.toString());
		System.out.println(map.toString());
		// define array of nodes
		Map<String,String> nodes = new HashMap();

		// find a node not in the map as key and in the set
		String removedNode = null;
		while(!set.isEmpty()) {
			removedNode = null;
			for (String string : set) {
				if (!map.containsKey(string) || map.get(string).isEmpty()) {
					removedNode = string;
					String parent = getParentOfChild(map,string);
					nodes.put(string,parent);
					break;

				}
				
			}
//			removedNode = nodes.get(nodes.size()-1);
			set.remove(removedNode);
			// find in the map a value node and it's parent and remove child
			for (Entry<String, List<String>> entry : map.entrySet()) {
				List<String> strings = entry.getValue();
				strings.remove(removedNode);
				
			} 
		}
		System.out.println(nodes.toString());

	}

	private String getParentOfChild(Map<String, List<String>> map, String child) {
		for (Entry<String, List<String>> entry : map.entrySet()) {
			List<String> list = entry.getValue();
				if (list.contains(child)) {
					return entry.getKey();
				}
			
		}
		return null;
		
	}

	public static void main(String[] args) {
		DayOne app = new DayOne();
//		System.out.println(app.firstRecurring("ABCA"));
//		System.out.println(app.firstRecurring("BCABA"));
//		System.out.println(app.firstRecurring("ABC"));

		List<Relation> list = new ArrayList<Relation>();
		list.add(new Relation("animal", "mammal"));
		list.add(new Relation("animal", "bird"));
		list.add(new Relation("lifeform", "animal"));
		list.add(new Relation("cat", "lion"));
		list.add(new Relation("mammal", "cat"));
		list.add(new Relation("animal", "fish"));

		app.printTree(list);
	}

}
