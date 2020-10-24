package leetCode30DaysChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class _12DayTwelve {
	static class Solution {
		public int lastStoneWeight(int[] stones) {
			if (stones.length<2) {
				return stones[0];
			}
			Integer[] newStones = Arrays.stream(stones).boxed().toArray(Integer[]::new);
			Arrays.sort(newStones, Collections.reverseOrder());
			
			for (int i = 0; i < newStones.length; i++) {
//				if (newStones[0]!= newStones[1]) {
					newStones[0] = newStones[0]- newStones[1];
					newStones[1]= 0;
					
					Arrays.sort(newStones, Collections.reverseOrder());					
//				}
			}
			return newStones[0];
		}
	
	}

	public static void main(String[] args) {
//		Scanner scanner= new Scanner(System.in);
//		int n = scanner.nextInt();
		int[] stones = { 2,2 };
//		for (int i = 0; i < stones.length; i++) {
//			stones[i] = scanner.nextInt();
//		}
		Solution solution = new Solution();
		System.out.println(solution.lastStoneWeight(stones));
	}
}