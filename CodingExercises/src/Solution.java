

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int longestSubarray(List<Integer> arr) {
        int count = 0;
        int j = 1;
        for(int i = 0; i<arr.size() && j<arr.size()-1; i++, j++){
          if(arr.get(i)-arr.get(j)==1){
              return 2;
          }
        }
    return 0;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}
        System.out.println(longestSubarray(arr));
    }
}

