package codejam;

import java.util.Scanner;
import java.util.Stack;

//https://codingcompetitions.withgoogle.com/codejam/round/00000000002017f7/0000000000201847
public class Solution{
// class OverSizedPancakeFlipper {

	public  int flpPancake(String string, int n) {
		if(allPlus(string)) {
			return 0;
		}
		Stack<String> stack = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		int count =0;
		for (int i = 0; i < string.length(); i++) {
			String s = string.charAt(i)+"";
			stack.push(s);
			if ( s.equals("+")) {
				while (!stack.isEmpty()) {
					String string2 = stack.pop();
					if(string2.equals("-")) {
						string2 = "+";
						
					}
					stack2.push(string2);
				}
				count++;
			
			}
			
		}
		boolean flag = false;
		for (int j = 0; j < stack2.size(); j++) {
			if (stack2.pop().equals("+")) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		if (flag) {
			return count;
		}
		return -1;
	}
	private  boolean allPlus(String s) {
		for (int i = 0; i < s.length(); i++) {
			String string = s.charAt(i)+"";
			if (!string.equals("+")) {
				return false;
			}
		}
		return true;
	}
// }
	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		
		for (int i = 0; i < m; i++) {
			String string = scanner.next();
			int x = scanner.nextInt();
			int y = solution.flpPancake(string, x);
			if (y>-1) {
				
			}
			else {
				int n = solution.flpPancake("---+-++-", 3);
				if (n >-1) {
					System.out.println("Case #"+i+": "+n);
				}
				else {
					System.out.println("Case #"+i+": IMPOSSIBLE");
			}
			}
			}
		}
		
}
