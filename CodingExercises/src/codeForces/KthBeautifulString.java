package codeForces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class KthBeautifulString {

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

	public static TreeSet<String> distinctPermute(String str) {

		if (str.length() == 0) {
			TreeSet<String> baseRes = new TreeSet<>();
			baseRes.add("");
			return baseRes;
		}
		char ch = str.charAt(0);

		String restStr = str.substring(1);
		TreeSet<String> prevRes = distinctPermute(restStr);
		TreeSet<String> Res = new TreeSet<>();
		for (String s : prevRes) {
			for (int i = 0; i <= s.length(); i++) {
				String f = s.substring(0, i) + ch + s.substring(i);
//				if (!isPresent(f, Res))

				Res.add(f);
			}
		}

		return Res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			TreeSet<String> list = new TreeSet<>();
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < n - 2; i++) {
				str.append("a");
			}
			str.append("b");
			str.append("b");
			list = distinctPermute(str.toString());
			ArrayList<String> arrayList = new ArrayList<>(list);
			System.out.println(arrayList.get(k - 1));

		}
	}
}