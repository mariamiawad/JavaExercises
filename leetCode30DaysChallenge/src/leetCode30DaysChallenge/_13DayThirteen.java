package leetCode30DaysChallenge;

import java.util.HashMap;
import java.util.Map;


public class _13DayThirteen {
	class Solution {
		public int findMaxLength(int[] nums) {
			Map<Integer, Integer> map = new HashMap<>();
			map.put(0, -1);
			int maxlen = 0, count = 0;
			for (int i = 0; i < nums.length; i++) {
				int n = -1;
				if (nums[i] == 1) {
					n = 1;
				}
				count = count + n;
				if (map.containsKey(count)) {
					maxlen = Math.max(maxlen, i - map.get(count));
				} else {
					map.put(count, i);
				}
			}
			return maxlen;
		}
	}
}
