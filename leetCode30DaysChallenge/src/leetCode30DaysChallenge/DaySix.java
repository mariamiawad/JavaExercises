package leetCode30DaysChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class DaySix {
	static class Solution {
	    public List<List<String>> groupAnagrams(String[] strs) {
	        List<List<String>> list = new ArrayList<>();
	        Map<String, List<Integer>> map = new HashMap<>();
	        List<Integer> integers = new ArrayList<>();
	        char[] chars;
	        for (int i = 0; i < strs.length; i++) {
	        	chars = new char[strs[i].length()];
				chars = strs[i].toCharArray();
				Arrays.sort(chars);
				
				if (!map.containsKey(Arrays.toString(chars))) {
					integers = new ArrayList<>();
					integers.add(i);
					map.put(Arrays.toString(chars), integers);
				}
				else {
					List<Integer> list2 = new ArrayList<>();
					list2 = map.get(Arrays.toString(chars));
					list2.add(i);
					map.put(Arrays.toString(chars), list2);
				}
			}
	        for (Entry<String, List<Integer>> entry : map.entrySet()) {
				List<Integer> integers1 = entry.getValue();
				List<String> strings2 = new ArrayList<>();
				for (int j = 0; j < integers1.size(); j++) {
					strings2.add(strs[integers1.get(j)]);
				}
				list.add(strings2);
			}
	        
	        return list;
	    }
	}
	public static void main(String[] args) {
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		Solution solution = new Solution();
		List<List<String>> list = solution.groupAnagrams(strs);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(Arrays.deepToString(list.toArray()));
		}
	}
	
}
