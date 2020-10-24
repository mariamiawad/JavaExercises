package leetCode30DaysChallenge;

public class _14DayFourteen {
	static class Solution {
		public String stringShift(String s, int[][] shifts) {
			int shiftDirection = 0;
			int shiftAmount = 0;
			String string = s;
			
			for (int i = 0; i < shifts.length; i++) {
//			for (int j = 0; j < shifts[i].length; j++) {
				shiftAmount = shifts[i][1];
				shiftDirection = shifts[i][0];
				if (shiftDirection == 0) {
					string = leftrotate(string, shiftAmount);
				}
				else if (shiftDirection == 1) {
					string =rightrotate(string, shiftAmount);
				}

//			}
			}
			return string;
		}

		private String leftrotate(String str, int d) 
	    { 
	            String ans = str.substring(d) + str.substring(0, d); 
	            return ans; 
	    } 
	  
	    // function that rotates s towards right by d  
	    private String rightrotate(String str, int d) 
	    { 
	            return leftrotate(str, str.length() - d); 
	    } 
	}
	  
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] shifts = {{1,1},{1,1},{0,2},{1,3}};
		String s= "abcdefg";
		System.out.println(solution.stringShift(s, shifts));
	}

}
