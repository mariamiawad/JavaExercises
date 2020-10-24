package hackerRank30DaysChallenge;
import java.io.*;
import java.util.*;

public class _06DaySix {
	
//	static class Solution {

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	int n = scanner.nextInt();
	    	String [] strings = new String[n];
	    	for (int i = 0; i < strings.length; i++) {
				strings[i] = scanner.next();
			}
	   
	    	for (int i = 0; i < strings.length; i++) {
				char[] chars = strings[i].toCharArray();
			 	String stringEven = "";
		    	String stringOdd = "";
				for (int j = 0; j < chars.length; j++) {
					if (j%2 ==0) {
						stringEven+=chars[j]+"";
					}
					else {
						stringOdd+= chars[j]+"";
					}
					
				}
				System.out.println(stringEven +" "+ stringOdd );
//				System.out.println();
			}
	    }
	}
//	public static void main(String[] args) {
//		Solution solution = new Solution();
//		solution.main(args);
//	}
//}
