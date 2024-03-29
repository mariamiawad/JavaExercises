import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialSubTree {

    // Complete the prims function below.
    static int prims(int n, int[][] edges, int start) {
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	map.put(start, 0);
    	for (int i =1; i < n; i++) {
			int minimum = Integer.MAX_VALUE;
			int selectedNode = 0;
			for (int j = 0; j < edges.length; j++) {
				if(map.containsKey(edges[j][0])&& !map.containsKey(edges[j][1])) {
					if(edges[j][2]<minimum) {
						minimum = edges[j][2];
						selectedNode = edges[j][1];
					}
				}
				else if(!map.containsKey(edges[j][0])&& map.containsKey(edges[j][1])) {
					if(edges[j][2]<minimum) {
						minimum = edges[j][2];
						selectedNode = edges[j][0];
					}
				}
			}
			map.put(selectedNode, minimum);
		}
    	int sum = 0;
    	for (Entry<Integer, Integer>entry : map.entrySet()) {
    		sum += entry.getValue();
			
		}
    	return sum;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] edges = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] edgesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int edgesItem = Integer.parseInt(edgesRowItems[j]);
                edges[i][j] = edgesItem;
            }
        }

        int start = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = prims(n, edges, start);
System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
