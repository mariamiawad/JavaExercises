import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class MissingNumbers {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
    	Arrays.sort(arr);
    	Arrays.sort(brr);
    	int [] tempArray ;
    	
    	
    	if(brr.length>arr.length) {
    		tempArray = brr;
    		brr = arr;
    		arr = tempArray;
    		
    	}
    	
    	int count = 0;
    	ArrayList<Integer>arrayList = new ArrayList<Integer>();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
    	for (int i = 0; i < brr.length; i++) {
    		if (!map.containsKey(brr[i])) {
				map.put(brr[i], count(brr, brr[i]));
			
			}
		}
    	for (int i = 0; i < arr.length; i++) {
    		
    		if(!map2.containsKey(arr[i])) {
    			map2.put(arr[i], count(arr, arr[i]));
    			
    		}
    		
			
		}	
    	for (Entry<Integer, Integer> entry:map.entrySet()) {
    		if(map2.containsKey(entry.getKey())) {
			if(!(entry.getValue().equals(map2.get(entry.getKey())))) {
				arrayList.add(entry.getKey());
			}
    		}
			else if(!map2.containsKey(entry.getKey())) {
					arrayList.add(entry.getKey());
				}
    		
//			else if(map.containsKey(key)))
//				
			}
    	for (Entry<Integer, Integer> entry2:map2.entrySet()) {
    	
    		
    		if(!map.containsKey(entry2.getKey())){
    			arrayList.add(entry2.getKey());
    		}
//				
			}
		
    	int [] array = new int [arrayList.size()];
    	for (int i = 0; i < array.length; i++) {
			array[i]=arrayList.get(i);
		}
    	Arrays.sort(array);
    	return array;
		}
    	
    public static int count (int array [], int number) {
    	 int count = 0;
    	for (int i = 0; i < array.length; i++) {
    		if(array[i]== number) {
    			count++;
    		}
		}
    	return count;
    }
  

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
          
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];
//
//        String[] brrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
//            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = scanner.nextInt();
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
//            bufferedWriter.write(String.valueOf(result[i]));

//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
