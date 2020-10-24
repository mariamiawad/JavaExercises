package week2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ComputeNumberOfInversions {
	static class Solution {
//		private int mergeAndCount(int array[], int l, int r, int m) {
//
//			int[] left = Arrays.copyOfRange(array, l, m + 1);
//			int[] right = Arrays.copyOfRange(array, m + 1, r + 1);
//			int i = 0;
//			int k = l;
//			int j = 0;
//			int count = 0;
//			while (i < left.length && j < right.length) {
//				if (left[i] <= right[j]) {
//					array[k] = left[i];
//					i++;
//				} else {
//					array[k] = right[j];
//					j++;
//					count += (m + 1) - (l + i);
//				}
//				k++;
//			}
//			while (i < left.length) {
//				array[k] = left[i];
//				i++;
//			}
//			while (j < right.length) {
//				array[k] = right[j];
//				k++;
//			}
//			return count;
//		}
//
//		private int mergeSortAndCount(int[] arr, int l, int r) {
//
//			int count = 0;
//
//			if (l < r) {
//				int m = (l + r) / 2;
//
//				// Total inversion count = left subarray count
//				// + right subarray count + merge count
//
//				// Left subarray count
//				count += mergeSortAndCount(arr, l, m);
//
//				// Right subarray count
//				count += mergeSortAndCount(arr, m + 1, r);
//
//				// Merge count
//				count += mergeAndCount(arr, l, m, r);
//			}
//
//			return count;
//		}
		private  BigInteger mergeAndCount(BigInteger[] arr, int l, int m, int r) 
	    { 
	  
	        // Left subarray 
	        BigInteger[] left = Arrays.copyOfRange(arr, l, m + 1); 
	  
	        // Right subarray 
	        BigInteger[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
	  
	        int i = 0, j = 0, k = l; BigInteger swaps =  BigInteger.ZERO; 
	  
	        while (i < left.length && j < right.length) { 
	            if (left[i].compareTo(right[j])<=0) 
	                arr[k++] = left[i++]; 
	            else { 
	                arr[k++] = right[j++]; 
	                swaps = swaps.add(BigInteger.valueOf((m + 1) - (l + i))); 
	            } 
	        } 
	  
	        // Fill from the rest of the left subarray 
	        while (i < left.length) 
	            arr[k++] = left[i++]; 
	  
	        // Fill from the rest of the right subarray 
	        while (j < right.length) 
	            arr[k++] = right[j++]; 
	  
	        return swaps; 
	    } 
	  
	    // Merge sort function 
		private  BigInteger mergeSortAndCount(BigInteger[] arr, int l, int r) {
			  
	        // Keeps track of the inversion count at a 
	        // particular node of the recursion tree 
	    	BigInteger count = BigInteger.ZERO; 
	  
	        if (l < r) { 
	            int m = (l + r) / 2; 
	  
	            // Total inversion count = left subarray count 
	            // + right subarray count + merge count 
	  	            // Left subarray count 
	            count = count.add(mergeSortAndCount(arr, l, m)); 
	  
	            // Right subarray count 
	            count = count.add(mergeSortAndCount(arr, m + 1, r)); 
	  
	            // Merge count 
	            count =count.add( mergeAndCount(arr, l, m, r)); 
	        } 
	  
	        return count; 
	    } 
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 100000;
		BigInteger[] array = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextBigInteger();
		}
		System.out.println();
		Solution solution = new Solution();

		System.out.println(solution.mergeSortAndCount(array, 0, array.length - 1));

	}

}
