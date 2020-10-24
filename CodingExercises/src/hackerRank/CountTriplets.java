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
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountTriplets {

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
        Map<Long, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i< arr.size(); i++){
        	if(map.containsKey(arr.get(i))) {
        		List<Integer> list2 = map.get(arr.get(i));
        		list2.add(i);
        		map.put(arr.get(i), list);
        		
        	}
        	else {
        		list = new ArrayList<>();
        		list.add(i);
        		map.put(arr.get(i), list);
        	}
        }
        List<Long> sortedKeys= new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        List<Integer> integers = new ArrayList<>();
       for (int i = 0; i < arr.size(); i++) {
		if()
	}
        
    }

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nr[0]);

		long r = Long.parseLong(nr[1]);

		List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(toList());

		long ans = countTriplets(arr, r);

		bufferedWriter.write(String.valueOf(ans));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
