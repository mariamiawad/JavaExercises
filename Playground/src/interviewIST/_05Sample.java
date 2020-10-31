package interviewIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class _05Sample {
	public static void main(String[] args) {
		_05Sample sample = new _05Sample();

		int[] nums = { 1, 1 };
		System.out.println(sample.findDisappearedNumbers(nums).toString());
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ans = new ArrayList<>();
		Set<Integer> rangeSet = new HashSet<>();
		Set<Integer> numSet = new HashSet<>();

		for (int i = 1; i <= nums.length; i++) {
			rangeSet.add(i);
		}
		for (int num : nums) {
			numSet.add(num);
		}

		for (int n : rangeSet) {
			if (!numSet.contains(n)) {
				ans.add(n);
			}
		}
		return ans;
	}
}
