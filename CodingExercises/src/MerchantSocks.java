import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MerchantSocks {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < ar.length; i++) {
			if(!map.containsKey(ar[i])) {
				map.put(ar[i], 1);
			}
			else {
				map.put(ar[i], map.get(ar[i])+1);
			}
		}
    	int count = 0;
    	for(Entry<Integer, Integer>entry : map.entrySet()) {
    		if(entry.getValue()>1) {
    			count += entry.getValue()/2;
    		}
    	}
    	return count;
    }
    public static long gcd(long a, long b) {
    	 
    	  if (b==0) 
    	    return a;
    	  else
    	    return gcd(b, a % b);
    	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
