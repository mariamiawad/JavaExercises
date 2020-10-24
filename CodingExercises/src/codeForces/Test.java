package codeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import sun.tools.jar.resources.jar;

public class Test {

//	public static  String solution(int n, int k) {
//		ArrayList<String> list = new ArrayList<>();
//		StringBuilder str = new StringBuilder();
//		for (BigDecimal i = BigDecimal.ZERO; i.compareTo(BigDecimal.valueOf(n-2))<0;i = i.add(i)) {
//			str.append("a");
//		}
//		str.append("b");
//		str.append("b");
//		list = distinctPermute(str.toString());
//		List<String> sortedList = new ArrayList<>(list);
//		Collections.sort(sortedList);
//		return sortedList.get(k);
//
//	}

//	public static boolean isPresent(String s, ArrayList<String> Res) {
//
//		for (String str : Res) {
//
//			if (str.equals(s))
//				return true;
//		}
//
//		return false;
//	}
	private static int countOnes(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		return count;

	}

	public static String distinctPermute(int n, int k) {
		int[] integers = { 0, 3, 5, 6, 9, 10, 17, 18, 20, 24 };
		String string = Integer.toBinaryString(integers[k]);
		

		string = string.replaceAll("1", "b");
		string = string.replaceAll("0", "a");
		String s ="";
		for (int i = 0; i <n- string.length(); i++) {
			s+="a";
		}
		return s+string;
//		Set<String> Res = new HashSet<>();
//		if (str.length() == 0) {
//			Res.add("");
//			return Res;
//		}
//		char ch = str.charAt(0);
// 
//		String restStr = str.substring(1);
//		Set<String> prevRes = distinctPermute(restStr);
//		
//		for (String s : prevRes) {
//			for (int i = 0; i <= s.length(); i++) {
//				String f = s.substring(0, i) + ch + s.substring(i);
////				if (!isPresent(f, Res))
// 
//				Res.add(f);
//			}
//		}
// 
//		return Res;
	}

	private void transformBinaryToString() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			Set<String> list = new HashSet<>();
			StringBuilder str = new StringBuilder();
			;
			String s = distinctPermute(n, k);
			System.out.println(s);
//			List<String> sortedList = new ArrayList<>(list);
//			Collections.sort(sortedList);
//			int i = 0;
//			for (String string : sortedList) {
//				if (i==k-1) {
//					System.out.println(string);
//					break;
//				}
//				i++;
//			
//			}
		}

	}
}