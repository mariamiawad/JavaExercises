package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import jdk.nashorn.internal.objects.NativeUint16Array;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
	public static long arrayManipulation(int n, List<List<Integer>> queries) {
	   

        long [] array =  new long[n];
        for (int i = 0; i < queries.size(); i++) {
        	int startIndex = queries.get(i).get(0)-1;
        	int endIndex = queries.get(i).get(1)-1;
        	int sum =queries.get(i).get(2);
			for (int j = startIndex; j <= endIndex; j++) {
				array[j] += sum;
			}
		}
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
			if(max< array[i]) {
				max = array[i];
			}
		}
        return max;
    }


    public static void main(String[] args) throws IOException {
    	File file = new File("C:\\Users\\maria\\OneDrive\\Desktop\\TextText.txt");

        Scanner scanner = new Scanner(new File("C:\\Users\\maria\\OneDrive\\Desktop\\customInput.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        List<List<Integer>> queries = new ArrayList<List<Integer>>();
        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                
                list.add(queriesItem);
            }
            queries.add(list);
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
}
