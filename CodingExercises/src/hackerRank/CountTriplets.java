package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import jdk.internal.misc.InnocuousThread;
import sun.security.krb5.internal.crypto.KeyUsage;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountTriplets {

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {

		int count = 0;
//		int size = 0;
//		long maxElement = 0;
//		Map<Long, List<Integer>> map = new HashMap<Long, List<Integer>>();
//
//		for (int i = 0; i < arr.size(); i++) {
//			if (map.containsKey(arr.get(i))) {
//				List<Integer> list = map.get(arr.get(i));
//				list.add(i);
//				if (size <= list.size()) {
//					size = list.size();
//					maxElement = arr.get(i);
//				}
//				map.put(arr.get(i), list);
//			} else {
//
//				List<Integer> list = new ArrayList<>();
//				list.add(i);
//				if (size <= list.size()) {
//					size = list.size();
//					maxElement = arr.get(i);
//				}
//				map.put(arr.get(i), list);
//			}
//
//		}
		int max = 0;
		

		return Math.min(max, count);
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int r = scanner.nextInt();
		List<Long> arr = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			arr.add(scanner.nextLong());
		}
		System.out.println(countTriplets(arr, r));
		scanner.close();
	}
}
